package chapter1

/**
 * Created by vicboma on 16/09/14.
 */
object Capital {
  def main(args: Array[String]) {
    capitals()
  }

  private def capitals() {
    var capitales = Map[String, String]("Spain" -> "Madrid", "France" -> "Paris")
    capitales += ("Japan" -> "Tokio")
    println(capitales("Spain"))
    println(capitales.toString())
  }
}
