package chapter20

/**
 * Created by vicboma on 26/09/14.
 */

object RationalMain{
  def main(args: Array[String]) {
    val x = 2

    val rationalTrait = new {
      val numerArg = 1 * x
      val denomArg = 2 * x
    } with RationalTrait

    println(rationalTrait.toString)

    new RationalTrait {
      override val denomArg: Int = 1
      override val numerArg: Int = 2
    }
  }
}

trait RationalTrait {
  val numerArg: Int
  val denomArg: Int
  require(denomArg != 0)
  private val g = gcd(numerArg, denomArg)
  val numer = numerArg / g
  val denom = denomArg / g

  private def gcd(a: Int, b: Int): Int = {
    b match {
      case 0 => a
      case _ => gcd(b, a % b)
    }
  }

  override def toString = numer +"/"+ denom
}

object twoThirds extends {
  val numerArg = 2
  val denomArg = 3
} with RationalTrait