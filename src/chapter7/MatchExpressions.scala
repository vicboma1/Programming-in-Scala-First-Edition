package chapter7

/**
 * Created by vicboma on 18/09/14.
 */
object MatchExpressions {
  def main(args: Array[String]) {
   _match(args)
  }

  private def _match(args:Array[String])
  {
    val firstArg = if (!args.isEmpty) args(0) else ""

    val friend =
      firstArg match {
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
      }

    println(friend)
  }
}
