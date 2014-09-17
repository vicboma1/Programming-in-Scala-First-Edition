package chapter3

/**
 * Created by vicboma on 17/09/14.
 */
object Loops {
  def main(args: Array[String]) {
    val args = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    _while(args)
    _for(args)
    _foreach(args)
  }

  private def _while(args: Array[Int]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
    space
  }

  private def _for(args: Array[Int]): Unit = {
    for (arg <- args)
      println(arg)
    space
  }

  private def _foreach(args: Array[Int]): Unit = {
    args.foreach(println)
    space
  }

  private def space {
    println()
  }
}
