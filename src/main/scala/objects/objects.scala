package objects

abstract class Animal {
  def eat: Unit
  def sleep: Unit
}

class Giraffe extends Animal {
  override def eat = println("tonguily")
  override def sleep = println("standing up")
}

class Cowfish extends Animal {
  override def eat = println("carefully")
  override def sleep = println("swimmingly")
}

object Program extends App {
  val animals: Seq[Animal] = List(new Giraffe(), new Cowfish())
  animals foreach {a ⇒
    a.eat
    a.sleep
  } 
}