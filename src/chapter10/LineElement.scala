package chapter10

/**
 * Created by vicboma on 19/09/14.
 */
final class LineElement(str:String) extends ArrayElement(Array(str)) {
  override def width = str.length
  override def height = 1
  override def demo() { println("LineElement's implementation invoked") }
}


