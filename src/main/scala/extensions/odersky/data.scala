package extensions.odersky

import odersky.Base

trait BasePlusPlatypus extends Base {
  class Platypus extends Animal {
    override def eat() = println("snap")
    override def speak() = println("quack")
  }
}

object ZooPlusData extends Base with BasePlusPlatypus {
  type animal = Animal  
}

object DataProgram extends App {
  import ZooPlusData._
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}