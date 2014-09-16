package chapter3

/**
 * Created by vicboma on 16/09/14.
 */
object ApplyMethod {
  def main(args: Array[String]) {
    ArrayMethod
    ArrayApplyMethod
  }

  private def ArrayApplyMethod {
    println()
    var names = Array.apply("Victor ", "Bolinches ", "Marin")
    names.foreach(print)
  }

  private def ArrayMethod {
    var names = Array("Victor ", "Bolinches ", "Marin")
    names.foreach(print)
    names = Array.empty[String]
  }
}
