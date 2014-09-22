package chapter15

/**
 * Created by vicboma on 22/09/14.
 */
object StrArray {
  def main (args: Array[String]) {
    val as = Array("abc")
    val aString = Array("a")
    val aChar = Array('a')
    val aInt = Array(1,2)

    println(isStringWithArray(as))
    println(isStringWithArray(aString))
    println(isStringWithArray(aChar))
    println(isStringWithArray(aInt))
  }

  def isStringWithArray(x: Any) = x match {
    case a: Array[String] => "yes"
    case _ => "no"
  }
}
