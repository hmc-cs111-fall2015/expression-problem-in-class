package extensions.oop


import oop.{Animal, Giraffe, Kangaroo}

// add extension here


object BehaviorProgram extends App {
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}