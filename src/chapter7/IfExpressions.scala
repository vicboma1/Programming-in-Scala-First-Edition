package chapter7

/**
 * Created by vicboma on 18/09/14.
 */
object IfExpressions {
  def main (args: Array[String]) {
    path(args)
    path(Array("Test.txt"))
  }

  private def path(args : Array[String]) {
    var filename = "default.txt"
    if (!args.isEmpty)
      filename = args(0)
    println(filename)
  }
}
