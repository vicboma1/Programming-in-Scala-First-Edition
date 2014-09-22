package chapter12

/**
 * Created by vicboma on 22/09/14.
 */
object main{
  def main (args: Array[String]) {
    val frog = new Frog
    frog.philosophize

    val phil:Philosophical = new Frog
    phil.philosophize

    val superFrog = new SuperFrog
    superFrog.philosophize
    println(superFrog.toString)

    val animal:Animal = new SuperFrog
    println(animal.toString)

    val philSuperFrog:Philosophical = new SuperFrog
    philSuperFrog.philosophize()
    println(philSuperFrog.toString)

  }
}

trait Philosophical {
  def philosophize() {
    println("I consume memory, therefore I am!")
  }
}

class Frog extends Animal with Philosophical {
  override def toString = "green"
}

class Animal {
  override def toString = "animal"
}

class SuperFrog extends Animal with Philosophical {
  override def toString = "Supergreen"

  override def philosophize() {
    println("It ain't easy being " + toString + "!")
  }
}