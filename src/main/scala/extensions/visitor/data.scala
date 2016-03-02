package extensions.visitor

import visitor.{Animal, Giraffe, Kangaroo, AnimalVisitor}

trait PlatypusAnimalVisitor extends AnimalVisitor {
  def visitPlatypus(platypus: Platypus): Unit
}

class Platypus extends Animal  {
  override def eat() = println("snap")
  override def speak() = println("quack")
  override def accept(visitor: AnimalVisitor) = 
    visitor.asInstanceOf[PlatypusAnimalVisitor].visitPlatypus(this)  // :(
}

object DataProgram extends App {
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}