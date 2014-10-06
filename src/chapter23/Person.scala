package chapter23

/**
 * Created by vicboma on 06/10/14.
 */
object Person {
  def main(args: Array[String]) {
    val lara = new Person("Lara", false)
    val bob = new Person("Bob", true)
    val julie = new Person("Julie", false, lara, bob)
    val persons = List(lara, bob, julie)
    println("Persons "+ persons.toString())

    for (p: Person <- persons; if !p.isMale; c <- p.children)
    yield (p.name, c.name)
  }
}

class Person(val name: String, val isMale: Boolean, val children: Person*)

