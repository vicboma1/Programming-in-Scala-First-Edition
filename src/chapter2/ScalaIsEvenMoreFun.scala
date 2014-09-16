package chapter2

/**
 * Created by vicboma on 16/09/14.
 */
object ScalaIsEvenMoreFun {
  def main(args: Array[String]) {
    var args = Array("Scale ","Is ","even ", "more ", "fun ");
    whileClassic(args)
  }

  private def whileClassic(args: Array[String]) {
    var i = 0
    while (i < args.length) {
      print(" " + args.apply(i));
      i += 1
    }
  }
}
