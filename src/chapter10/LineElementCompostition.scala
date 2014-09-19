package chapter10

/**
 * Created by vicboma on 19/09/14.
 */
class LineElementCompostition(str:String) extends Element{
  val contents = Array(str)
  override def width = str.length
  override def height = 1
}
