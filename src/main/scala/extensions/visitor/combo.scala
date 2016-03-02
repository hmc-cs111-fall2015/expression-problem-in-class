package extensions.visitor

import visitor.{ Animal, Giraffe, Kangaroo }

/**
 * To add a new data kind *and* a new behavior, we define a new behavior
 * over the new data kind. 
 */
class ComboMove extends Move with PlatypusAnimalVisitor {
  override def visitPlatypus(platypus: Platypus) = println("waddle")
}

object ComboProgram extends App {
  object mover extends ComboMove
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach { a ⇒
    a.eat()
    a.speak()
    a.accept(mover)
  }
}
