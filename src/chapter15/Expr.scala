package chapter15

/**
 * Created by vicboma on 22/09/14.
 */
  sealed abstract class Expr
  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String,left: Expr, right: Expr) extends Expr

object main{
  def main (args: Array[String]) {
    val result = describe(UnOp("-", UnOp("-", Var("x"))))
    println(result)
  }

  def describe(e: Expr): String = e match {
    case Number(_) => "a number"
    case Var(_) => "a variable"
    case _ => "Exception" //throw new RuntimeException // Should not happen
  }
}