package odersky

/*******************************************************************************
 * Based on the paper 
 *    Independently Extensible Solutions to the Expression Problem
 *    http://scala-lang.org/docu/files/IC_TECH_REPORT_200433.pdf
 * by Zenger and Odersky
 ******************************************************************************/

trait Base {
  type animal <: Animal
  trait Animal {
    def eat(): Unit
    def speak(): Unit
  }
  class Giraffe extends Animal {
    override def eat() = println("high up")
    override def speak() = println("low humming noise")
  }
  class Kangaroo extends Animal {
    override def eat() = println("bouncingly")
    override def speak() = println("boing")
  }
}

object BaseZoo extends Base {
  type animal = Animal
}

object Program extends App {
  import BaseZoo._
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}