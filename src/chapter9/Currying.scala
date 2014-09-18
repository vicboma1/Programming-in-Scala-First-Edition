package chapter9

/**
 * Created by vicboma on 19/09/14.
 */
object Currying {
  def main (args: Array[String]) {
    plainOldSum(4,5)
    curriedSum(4)(5)
    val second = first(1)
    println(second)
    println(second(2))
    val onePlus = curriedSum(1)_
    println(onePlus(5))
  }

  private def plainOldSum(x: Int, y: Int) {
    println(x + y)
  }

  private def curriedSum(x: Int)(y: Int) {
    println(x + y)
  }

  private def first(x: Int) = (y: Int) => x + y
}
