package chapter2

/**
 * Created by vicboma on 16/09/14.
 */
object ScalaIsFun {
  def main(args: Array[String]) {
    var args = Array("Scale ", "is ", "fun ");
    whileClassic(args)
  }

  private def whileClassic(args: Array[String]) {
    var i = 0;
    while (i < args.length) {
      println(args.apply(i))
      i += 1
    }
    print()
  }
}
