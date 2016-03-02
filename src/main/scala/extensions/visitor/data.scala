package extensions.oophack

/**
 * This code is identical to the standard object-oriented way of adding new
 * kinds of data. We don't need to take advantage of the Visitor-Pattern hack.
 */
import oophack.{Animal, Giraffe, Kangaroo}

class Platypus extends Animal {
  override def eat() = println("eat")
  override def speak() = println("quack")
}

object DataProgram extends App {
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}