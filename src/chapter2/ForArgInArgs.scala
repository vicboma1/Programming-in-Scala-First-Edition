package chapter2

/**
 * Created by vicboma on 16/09/14.
 */
object ForArgInArgs {
  def main(args: Array[String]) {
    var args = Array("For ","arg" ,"in ", "args ");
    forClassic(args)
  }

  private def forClassic(args: Array[String]) {
    for (arg <- args)
      println(arg)
  }
}
