package visitor

/*******************************************************************************
 * The dreaded "Visitor Pattern" is a hack that makes it possible for someone to
 * add new behaviors to an existing class hierarchy. It works by defining a 
 * method called `accept`, for all the classes in the hierarchy. This method 
 * takes an argument called `behavior` that is essentially a 
 * functional-programming implementation of the behavior. In other words, 
 * `behavior` will provide a way to call a function that defines the new 
 * behavior by pattern-matching on the kind of data passed into the function.
 ******************************************************************************/

/**
 * Any class that wants to be able to extend its set of behaviors 
 * should extend the following trait.
 */
trait ExtensibleAnimal {
  def accept(behavior: AnimalVisitor)
}

/**
 * Any new behavior definition should extend the following trait.
 */
trait AnimalVisitor {
  def visitGiraffe(giraffe: Giraffe): Unit
  def visitKangaroo(kangaroo: Kangaroo): Unit
}

/**
 * We have to design from the start with extensibility in mind. So, the 
 * Animal class extends Extensible.
 */
abstract class Animal extends ExtensibleAnimal {
  def eat(): Unit
  def speak(): Unit
}

/**
 * All the code below this point is identical to the standard object-oriented
 * way of doing things.
 */
class Giraffe extends Animal {
  override def eat() = println("high up")
  override def speak() = println("low humming sound")
  override def accept(visitor: AnimalVisitor) = visitor.visitGiraffe(this) 
}

class Kangaroo extends Animal {
  override def eat() = println("bouncingly")
  override def speak() = println("boing")
  override def accept(visitor: AnimalVisitor) = visitor.visitKangaroo(this) 
}

object Program extends App {
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo())
  animals foreach {a ⇒
    a.eat()
    a.speak()
  } 
}