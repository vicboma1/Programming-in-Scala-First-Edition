package chapter23

/**
 * Created by vicboma on 06/10/14.
 */
object ForExpression {
  def main(args: Array[String]) {
    for (x <- List(1, 2); y <- List("one", "two"))
    yield (x, y)
  }
}
