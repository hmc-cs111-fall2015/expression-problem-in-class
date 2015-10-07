package functional {
  abstract class Animal
  case class Giraffe() extends Animal
  case class Cowfish() extends Animal
}

package object functional {
  def eat(animal: Animal): Unit = animal match {
    case _: Giraffe ⇒ println("tonguily")
    case _: Cowfish ⇒ println("carefully")
  }

  def sleep(animal: Animal): Unit = animal match {
    case _: Giraffe ⇒ println("standing up")
    case _: Cowfish ⇒ println("swimmingly")
  }
}

package functional {
  object Program extends App {
    val animals: Seq[Animal] = List(new Giraffe(), new Cowfish())
    animals foreach {a ⇒
      eat(a)
      sleep(a)
    } 
  }
}
