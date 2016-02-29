package oop

object Program extends App {
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}
