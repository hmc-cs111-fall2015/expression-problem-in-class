package extensions.odersky

trait MovePlusPlatypus extends BasePlusMove with BasePlusPlatypus {
  type animal <: Animal
  trait Animal extends super[BasePlusMove].Animal 
                  with super[BasePlusPlatypus].Animal 
  class Platypus extends super.Platypus with Animal {
    override def move() = println("waddle")
  }
  class Giraffe extends super[BasePlusMove].Giraffe with Animal
  class Kangaroo extends super[BasePlusMove].Kangaroo with Animal
}

object ComboZoo extends MovePlusPlatypus {
  type animal = Animal
}

object ComboProgram extends App {
  import ComboZoo._
  val animals: Seq[Animal] = List(new Giraffe(), new Kangaroo(), new Platypus())
  animals foreach { a ⇒
    a.eat()
    a.speak()
    a.move()
  }
}