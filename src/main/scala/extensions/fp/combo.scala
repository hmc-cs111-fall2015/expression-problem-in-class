package extensions.fp

import functional.Animal
import functional.Giraffe
import functional.Cowfish
import extensions.fp.{move ⇒ b3}

object ComboProgram extends App {
  def move(a: Animal): Unit = a match {
    case _: Bear ⇒ println("angrily")
    case _  ⇒ b3(a)
  }

  val animals: Seq[Animal] = List(Giraffe(), Cowfish(), Bear())
  animals foreach {a ⇒
    eat(a)
    sleep(a)
    move(a)
  } 
}