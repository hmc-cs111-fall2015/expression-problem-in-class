package extensions.fp

package object data {
  import fp.Animal

  // extension goes here
}

object DataProgram extends App {
  import fp.{ Animal, Giraffe, Kangaroo }
  import data.{ Platypus, eat, speak }

  val animals: Seq[Animal] = List(Giraffe(), Kangaroo(), Platypus())
  animals foreach { a ⇒
    eat(a)
    speak(a)
  }
}