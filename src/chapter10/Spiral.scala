package chapter10

/**
 * Created by vicboma on 19/09/14.
 */
object Spiral {

  val space = ElementFactory.elem(" ")
  val corner = ElementFactory.elem("+")

  def spiral(nEdges: Int, direction: Int): Element = {
    if (nEdges == 1)
      ElementFactory.elem("+")
    else {
      val sp = spiral(nEdges - 1, (direction + 3) % 4)
      def verticalBar = ElementFactory.elem('|', 1, sp.height)
      def horizontalBar = ElementFactory.elem('-', sp.width, 1)
      if (direction == 0)
        (corner beside horizontalBar) above (sp beside space)
      else if (direction == 1)
        (sp above space) beside (corner above verticalBar)
      else if (direction == 2)
        (space beside sp) above (horizontalBar beside corner)
      else
        (verticalBar above corner) beside (space above sp)
    }
  }

  def main(args: Array[String]) {
    val nSides = 16//args(0).toInt
    println(spiral(nSides, 0))
  }
}
