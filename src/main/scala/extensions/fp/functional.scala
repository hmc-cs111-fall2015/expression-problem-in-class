package extensions.fp

import functional.Animal
import functional.Giraffe
import functional.Cowfish
import extensions.fp.{behavior3 ⇒ b3}


/**
 * Add a new data type
 */
case class Bear() extends Animal

object FirstProgram extends App {
  val animals: Seq[Animal] = List(Giraffe(), Cowfish())
  animals foreach {a ⇒
    eat(a)
    sleep(a)
    move(a)
  }
  
  println()
  
  val allAnimals: Seq[Animal] = List(Giraffe(), Cowfish(), Bear())
  allAnimals foreach {a ⇒
    eat(a)
    sleep(a)
  }
}