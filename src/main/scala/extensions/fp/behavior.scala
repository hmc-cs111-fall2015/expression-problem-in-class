package extensions.fp

package object behavior {
  import fp.{ Animal, Giraffe, Kangaroo }

  // add extension here
}

object BehaviorProgram extends App {
  import fp.{ Animal, Giraffe, Kangaroo, eat, speak }
  import behavior.{ move }

  val animals: Seq[Animal] = List(Giraffe(), Kangaroo())
  animals foreach { a ⇒
    eat(a)
    speak(a)
    move(a)
  }
}
