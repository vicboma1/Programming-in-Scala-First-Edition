package chapter16

/**
 * Created by vicboma on 23/09/14.
 */
object ListGeneric {
  def main (args: Array[String]) {
    val fruit: List[String] = List("apples", "oranges", "pears")
    val nums: List[Int] = List(1, 2, 3, 4)
    val diag3: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    val empty: List[Any] = List()
    val xs: List[String] = List()

    println(empty.isEmpty)
    println(fruit.isEmpty)
    println(fruit.head)
    println(fruit.tail.head)
    println(diag3.head)

    val List(a, b, c) = fruit
    println(a.toString+" "+b.toString+" "+c.toString)

    val d :: f :: rest = fruit
    println(d+" "+f+" "+rest)
  }
}
