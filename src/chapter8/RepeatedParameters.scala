package chapter8

/**
 * Created by vicboma on 19/09/14.
 */
object RepeatedParameters {
  def main (args: Array[String]) {
    echo(Array("Hello","World","!"))
  }

  def echo(args:Array[String]){
    args.foreach(println(_))
  }
}
