package extensions.oop


import oop.{Animal, Giraffe, Kangaroo}

class Platypus extends Animal {
  override def eat() = println("eat")
  override def speak() = println("quack")
}


object Program extends App {
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}