package extensions.oophack

import oophack.{ Behavior, Animal, Giraffe, Kangaroo, Extensible }

/**
 * Here, we use the Visitor-Pattern hack to add a new behavior to an
 * existing class hierarchy. Note that it looks a *lot* like the
 * functional-programming solution.
 */
class Move extends Behavior {
  override def performBy(entity: Extensible) = entity match {
    case _: Giraffe  ⇒ println("skip")
    case _: Kangaroo ⇒ println("hop")
  }
}

/**
 * Here's a program that uses Animal's accept method to call the new behavior.
 */
object BehaviorProgram extends App {
  val behavior = new Move()
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo())
  animals foreach { a ⇒
    a.eat()
    a.speak()
    a.accept(behavior)  // we could also say a.move(), thanks to the code below
  }
}

/**
 * The companion object is not necessary to get the program to work, but it
 * adds some nice syntactic sugar, using the techniques we've learned from
 * implementing internal DSLs.
 *
 * In particular, it lets us say animal.move(), even though animals don't have
 * a move method.
 */
object Move {
  import scala.language.implicitConversions
  class AddMover(val animal: Animal, val behavior: Behavior = new Move()) {
    def move() = behavior.performBy(animal)
  }
  implicit def animalToMover(animal: Animal): AddMover = new AddMover(animal)
}
