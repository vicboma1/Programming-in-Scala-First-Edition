package chapter10

/**
 * Created by vicboma on 19/09/14.
 */
object Main {
  def main(args: Array[String]) {
    // new Element  -> Error
    val ae = new ArrayElement(Array("hello", "world", "!"))
    var width = ae.width
    var height = ae.height
    println("Name Object: " + ae + " width: " + width + " height: " + height)
    val e: Element = new ArrayElement(Array("hello"))
    println("Name Object: " + e + " width: " + e.width + " height: " + e.height)

    val e1: Element = new ArrayElement(Array("hello", "world"))
    val a4: ArrayElement = new LineElement("hello")
    val a6: LineElement = new LineElement("hello")
    val e2: Element = a4
    val e5: Element = new UniformElement('x', 2, 3)
    val e3: UniformElement = new UniformElement('z', 4, 5)

    e3.invokeDemo(e1)
    e3.invokeDemo(a6)
    e3.invokeDemo(e3)

    new ArrayElement(Array("hello")) above
    new ArrayElement(Array("world!"))

    new ArrayElement(Array("one", "two")) beside
    new ArrayElement(Array("one"))
  }


}
