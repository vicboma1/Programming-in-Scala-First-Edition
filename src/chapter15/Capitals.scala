package chapter15

/**
 * Created by vicboma on 22/09/14.
 */
object Capitals {
  def main (args: Array[String]) {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
    println(capitals.toString())

    show(capitals.get("Japan"))
    show(capitals.get("North Pole"))
  }

  def show(x: Option[String]) : Any = x match {
    case Some(s) => println(s)
    case None => println("?")
  }
}
