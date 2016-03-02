package oop

abstract class Animal {
  def eat(): Unit
  def speak(): Unit
}

class Giraffe extends Animal { 
  override def eat() = println("high up")
  override def speak() = println("low humming sound")
}

class Kangaroo extends Animal {
  override def eat() = println("bouncingly")
  override def speak() = println("boing")
}
