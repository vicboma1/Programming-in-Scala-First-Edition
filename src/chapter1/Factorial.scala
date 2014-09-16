package chapter1

/**
 * Created by vicboma on 16/09/14.
 */
object Factorial {
  def main(args: Array[String]) {
    var result = factorial(5)
    println(result)
  }

  private def factorial(x: BigInt): BigInt = {
    if (x == 0) 1
    else x * factorial(x - 1)
  }
}


