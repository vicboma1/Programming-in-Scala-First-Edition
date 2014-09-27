package chapter20

/**
 * Created by vicboma on 27/09/14.
 */
object Enumeration {
  def main(args: Array[String]) {
    Direction.values.foreach(println)
  }
}
object Color extends Enumeration {
  val Red = Value
  val Green = Value
  val Blue = Value
}

object Direction extends Enumeration {
  val North = Value("North")
  val East = Value("East")
  val South = Value("South")
  val West = Value("West")
}
