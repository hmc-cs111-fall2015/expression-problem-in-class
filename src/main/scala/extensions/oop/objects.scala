package extensions.oop

import objects._

/**
 * Add a new data type
 */
class Bear extends Animal {
  override def eat = println("aggressively")
  override def sleep = println("forever")
}

/**
 * Add a new behavior
 */
trait Move extends Animal {
  def move: Unit
}

class MovingGiraffe extends Giraffe with Move {
  override def move = println("awkwardly")
}

class MovingCowfish extends Cowfish with Move {
  override def move = println("smoothly")
}

object FirstProgram extends App {
  val animals: Seq[Animal with Move] = 
    List(new MovingGiraffe(), new MovingCowfish())
  animals foreach {a ⇒
    a.eat
    a.sleep
    a.move
  } 
  
  println()
  
  val allAnimals: Seq[Animal] = 
    List(new Giraffe(), new Cowfish(), new Bear())
  allAnimals foreach {a ⇒
    a.eat
    a.sleep
  } 
}