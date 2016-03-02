package extensions.visitor

import visitor.{ AnimalVisitor, Animal, Giraffe, Kangaroo, ExtensibleAnimal }

/**
 * Here, we use the Visitor-Pattern hack to add a new behavior to an
 * existing class hierarchy.
 */
class Move extends AnimalVisitor {
  override def visitGiraffe(giraffe: Giraffe) = println("skip")
  override def visitKangaroo(kangaroo: Kangaroo) = println("hop")
}

/**
 * Here's a program that uses Animal's accept method to call the new behavior.
 */
object BehaviorProgram extends App {
  val move = new Move()
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo())
  animals foreach { a ⇒
    a.eat()
    a.speak()
    a.accept(move) // :(  
  }
}
