package chapter9

/**
 * Created by vicboma on 19/09/14.
 */
object ControlStructures {
  def main (args: Array[String]) {
    val result = twice(_ + 1, 5) //twice(d => d + 1, 5)
    println(result)
  }

  private def twice(op: Double => Double, x: Double) = op(op(x))
}
