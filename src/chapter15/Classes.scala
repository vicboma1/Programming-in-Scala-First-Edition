package chapter15

/**
 * Created by vicboma on 22/09/14.
 */
object Classes {
  def main(args: Array[String]) {
    val list = List(
      describe(5),
      describe(true),
      describe("hello"),
      describe(Nil),
      describe(List(1, 2, 3)),
      describe(0),
      describe(Math.PI)
    )

    list.foreach(println)
  }

  def describe(x: Any): String = x match {
    case 5 => "five"
    case Math.PI => "strange math? Pi = " + Math.PI
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case 0 => "zero"
    case List(_, _, _) => "found it"
    case _ => "something else"
    case somethingElse => "not zero: " + somethingElse
  }

  def toYesOrNo(choice: Int): String = choice match {
    case 1 | 2 | 3 => "yes"
    case 0 => "no"
    case _ => "error"
  }
}
