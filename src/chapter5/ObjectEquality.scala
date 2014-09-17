package chapter5

/**
 * Created by vicboma on 17/09/14.
 */
object ObjectEquality {
  def main (args: Array[String]) {
    println(1 == 2)
    println(1 != 2)
    println(2 == 2)
    println(List(1, 2, 3) == List(1, 2, 3))
    println( List(1, 2, 3) == List(4, 5, 6))
    println(List(1, 2, 3) == "hello")
    println(2 == 2.0)
    println(null == List(1, 2, 3))
    println(("he"+"llo") == "hello")
  }
}
