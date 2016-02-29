package extensions.fp

package object behavior {
  import fp.{ Animal, Giraffe, Kangaroo }

  def move(animal: Animal) = animal match {
    case Giraffe()  ⇒ println("skip")
    case Kangaroo() ⇒ println("hop")
  }
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
