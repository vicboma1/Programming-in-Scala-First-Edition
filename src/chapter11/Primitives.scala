package chapter11

/**
 * Created by vicboma on 19/09/14.
 */
object Primitives {
  def main (args: Array[String]) {

    var result = isEqual(421, 421)
    println(result)

    var x = "abcd".substring(2)
    var y = "abcd".substring(2)
    println(x == y)

    x = new String("abc")
    y = new String("abc")
    println(x == y)
    println(x eq y)
    println(x ne y)
  }

  def isEqual(x: Int, y: Int) = x == y
}
