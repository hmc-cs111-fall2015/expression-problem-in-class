package extensions

import functional.Giraffe
import functional.Cowfish
import functional.Animal
import functional.{ eat ⇒ b1 }
import functional.{ sleep ⇒ b2 }

package object fp {
  /**
   * Define behaviors for new animal
   */
  def eat(animal: Animal): Unit = animal match {
    case _: Bear ⇒ println("aggressively")
    case _       ⇒ b1(animal)
  }

  def sleep(animal: Animal): Unit = animal match {
    case _: Bear ⇒ println("forever")
    case _       ⇒ b2(animal)
  }

  /**
   * Add a new behavior
   */
  def move(animal: Animal): Unit = animal match {
    case _: Giraffe ⇒ println("awkwardly")
    case _: Cowfish ⇒ println("smoothly")
  }
}