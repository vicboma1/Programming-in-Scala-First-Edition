package chapter4

/**
 * Created by vicboma on 17/09/14.
 */
object ScalaApp {
  def main(args: Array[String]) {
    val args = Array("Every", "value", "is", "an", "object.", "of","love");
    args.foreach(
      arg => println(arg + ": " + ChecksumAccumulaterSingleton.calculate(arg))
    )
  }
}
