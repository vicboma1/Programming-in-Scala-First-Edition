package chapter10

/**
 * Created by vicboma on 19/09/14.
 */
final class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
  def contents:Array[String] = Array(ch.toString * width)
  def invokeDemo(e: Element) = e.demo()
}