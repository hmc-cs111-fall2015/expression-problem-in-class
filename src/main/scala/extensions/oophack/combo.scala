package extensions.oophack

import oophack.{ Animal, Giraffe, Kangaroo, Behavior, Extensible }

// add extension here

object ComboProgram extends App {
  object moveBehavior extends ComboMove
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach { a ⇒
    a.eat()
    a.speak()
    a.accept(moveBehavior)
  }
}
