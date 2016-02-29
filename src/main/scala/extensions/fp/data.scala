package extensions.fp

package object data {
  import fp.Animal

  /** define the new kind of data */
  case class Platypus() extends Animal

  /**
   *  define the existing behaviors to work on the new data kind
   */
  def eat(animal: Animal) = animal match {
    case Platypus() ⇒ println("snap")
    case _          ⇒ fp.eat(animal)
  }

  def speak(animal: Animal) = animal match {
    case Platypus() ⇒ println("quack")
    case _          ⇒ fp.speak(animal)
  }
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