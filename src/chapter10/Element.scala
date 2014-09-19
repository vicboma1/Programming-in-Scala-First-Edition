package chapter10

/**
 * Created by vicboma on 19/09/14.
 */
abstract class Element {
  def contents: Array[String]
  def demo() { println("Element's implementation invoked") }
  def height = contents.length
  def width = if (height != 0) contents(0).length else 0

  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)

  def beside(that: Element): Element =
    new ArrayElement(
      for (
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )

  def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = ElementFactory.elem(' ', (w - width) / 2, height)
      var right = ElementFactory.elem(' ', w - width - left.width, height)
      left beside this beside right
    }

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = ElementFactory.elem(' ', width, (h - height) / 2)
      var bot = ElementFactory.elem(' ', width, h - height - top.height)
      top above this above bot
    }

  override def toString = contents mkString "\n"
}

