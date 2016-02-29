package extensions.fp

package object combo {
  import fp.Animal
  import data.Platypus

  def move(animal: Animal) = animal match {
    case Platypus() ⇒ println("waddle")
    case _          ⇒ behavior.move(animal)
  }
}

object ComboProgram extends App {
  import fp.{ Animal, Giraffe, Kangaroo }
  import data.{ Platypus, eat, speak }
  import combo.move

  val animals: Seq[Animal] = List(Giraffe(), Kangaroo(), Platypus())
  animals foreach { a ⇒
    eat(a)
    speak(a)
    move(a)
  }
}