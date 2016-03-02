package extensions.odersky

import odersky.Base

trait BasePlusMove extends Base {
  type animal <: Animal
  trait Animal extends super.Animal {
    def move(): Unit
  }
  
  class Giraffe extends super.Giraffe with Animal {
    override def move() = println("skip")
  }
  
  class Kangaroo extends super.Kangaroo with Animal {
    override def move() = println("hop")
  }
}

object MoveZoo extends BasePlusMove {
  type animal = Animal
}

object BehaviorProgram extends App {
  import MoveZoo._
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo())
  animals foreach { a ⇒
    a.eat()
    a.speak()
    a.move()
  }
}