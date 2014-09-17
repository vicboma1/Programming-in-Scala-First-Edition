package chapter5

/**
 * Created by vicboma on 17/09/14.
 */
object StripMargin {
  def main (args: Array[String]) {
    println("""Welcome to Ultamix 3000.
             Type "HELP" for help.""")

    println("""|Welcome to Ultamix 3000.
              |Type "HELP" for help.""".stripMargin)
  }
}
