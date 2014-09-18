package chapter8

/**
 * Created by vicboma on 19/09/14.
 */
object Closures {
  def main (args: Array[String]) {
    addmoreFunction
    someNumbersFunction
  }

  private def addmoreFunction {
    var more = 1
    val addMore = (x: Int) => x + more
    var resutl = addMore(10)
    println(resutl)
  }

  private def someNumbersFunction {
    val someNumbers = List(-11, -10, -5, 10, 5, 10)
    var sum = -1
    someNumbers.toStream.foreach(i => sum += i)
    println(sum)
  }
}
