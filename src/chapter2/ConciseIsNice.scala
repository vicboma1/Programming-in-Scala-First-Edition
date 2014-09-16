package chapter2

/**
 * Created by vicboma on 16/09/14.
 */
object ConciseIsNice {
  def main(args:Array[String]){
    var args = Array("Concise ","Is ","Nice ");
    foreachWithElement(args)
    foreach(args)
  }

  private def foreach(args: Array[String]) {
    println("args.foreach(println)")
    args.foreach(println)
  }

  private def foreachWithElement(args: Array[String]) {
    println("args.foreach(x => println(x))")
    args.foreach(x => println(x))
    println()
  }
}
