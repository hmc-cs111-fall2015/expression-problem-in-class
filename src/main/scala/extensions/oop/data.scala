package extensions.oop


import oop.{Animal, Giraffe, Kangaroo}

// data extension goes here

object Program extends App {
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}