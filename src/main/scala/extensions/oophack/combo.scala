package extensions.oophack

import oophack.{ Animal, Giraffe, Kangaroo, Behavior, Extensible }

/**
 * To add a new data kind *and* a new behavior, we define a new behavior
 * over the new data kind. Note that this solution is a *lot* like the
 * function solution.
 */
class ComboMove extends Move {
  override def performBy(entity: Extensible) = entity match {
    case _: Platypus ⇒ println("waddle")
    case _           ⇒ super.performBy(entity)
  }
}

/**
 * A companion object that lets us say animal.move() for all the kinds of 
 * animals in our menagerie.
 */
object ComboMove {
  import scala.language.implicitConversions
  import Move.AddMover
  implicit def animalToMover(animal: Animal): AddMover =
    new AddMover(animal, new ComboMove())
}

object ComboProgram extends App {
  import ComboMove._
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach { a ⇒
    a.eat()
    a.speak()
    a.move()
  }
}
