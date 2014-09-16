package chapter3

/**
 * Created by vicboma on 16/09/14.
 */
object Lists {
  def main(args: Array[String]) {
    initialize
    mutated
    mkString
    mkMap
    sorted
  }

  private def sorted {
    val helloWord = List("a", "z", "x", "w")
    var result = helloWord.sorted
    println(result)
  }

  private def mkMap {
    val helloWord = List("Hello"," World!")
    var result = helloWord.map(x => "["+x+"]")
    println(result)
  }

  private def mkString {
    val helloWord = List("Hello"," World!")
    var result = helloWord.mkString(",")
    println(result)
  }

  private def mutated {
    val twoThree = List(2, 3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)
  }

  private def initialize {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println("" + oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new list.")
  }
}

