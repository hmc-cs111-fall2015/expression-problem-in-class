package extensions

import functional.Giraffe
import functional.Cowfish
import functional.Animal
import functional.{ eat ⇒ eat_prev }
import functional.{ sleep ⇒ sleep_prev }

package object fp {
  /**
   * Define behaviors for new animal
   */
  def eat(animal: Animal): Unit = animal match {
    case _: Bear ⇒ println("aggressively")
    case _       ⇒ eat_prev(animal)
  }

  def sleep(animal: Animal): Unit = animal match {
    case _: Bear ⇒ println("forever")
    case _       ⇒ sleep_prev(animal)
  }

  /**
   * Add a new behavior
   */
  def move(animal: Animal): Unit = animal match {
    case _: Giraffe ⇒ println("awkwardly")
    case _: Cowfish ⇒ println("smoothly")
  }
}