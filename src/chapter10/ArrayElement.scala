package chapter10

/**
 * Created by vicboma on 19/09/14.
 */
class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
  override def demo() { println("ArrayElement's implementation invoked") }
}

