package chapter12

/**
 * Created by vicboma on 22/09/14.
 */
object Main {
  def main (args: Array[String]) {
    val rect = new Rectangle(new Point(1, 1),new Point(10, 10))
    println(rect.left)
    println(rect.right)
    println(rect.width)
  }
}
class Point(val x: Int, val y: Int) {
}

class Rectangle(val topLeft: Point, val bottomRight: Point) {
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}

abstract class Component extends Rectangular {
  override def toString = "Component"
}