package fp

object Program extends App {
  val animals: Seq[Animal] = List(Giraffe(), Kangaroo())
  animals foreach { a ⇒
    eat(a)
    speak(a)
  }
}
