package chapter20

/**
 * Created by vicboma on 26/09/14.
 */

object DemoMain{
  def main(args: Array[String]) {
    println("Demo "+Demo)
    println("Demo.x "+Demo.x)
  }
}

object Demo {
  val x = {
    println("initializing x")
    "done"
  }
}
