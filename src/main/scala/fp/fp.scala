package object fp {

  abstract class Animal
  case class Giraffe() extends Animal
  case class Kangaroo() extends Animal

  def eat(animal: Animal): Unit = animal match {
    case Giraffe()  ⇒ println("high up")
    case Kangaroo() ⇒ println("bouncingly")
  }

  def speak(animal: Animal): Unit = animal match {
    case Giraffe()  ⇒ println("low humming sound")
    case Kangaroo() ⇒ println("boing")
  }
}
