package extensions.oop

import objects._ 

class MovingBear extends Bear with Move {
  override def move = println("angrily")
}

object ComboProgram extends App {
  val animals: Seq[Animal with Move] = 
    List(new MovingGiraffe(), new MovingCowfish(), new MovingBear())
  animals foreach {a ⇒
    a.eat
    a.sleep
    a.move
  } 
}