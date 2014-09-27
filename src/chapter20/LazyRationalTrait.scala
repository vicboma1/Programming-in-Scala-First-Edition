package chapter20

/**
 * Created by vicboma on 26/09/14.
 */
object LazyRationalMain{
  def main(args: Array[String]) {
    val x = 2
    val rationalTraitLazy = new LazyRationalTrait {
      val numerArg = 1 * x
      val denomArg = 2 * x
    }
    println(rationalTraitLazy)

    val rationalTrait = new {
      val numerArg = 1 * x
      val denomArg = 2 * x
    } with LazyRationalTrait
    println(rationalTrait)

  }
}

trait LazyRationalTrait {
  val numerArg: Int
  val denomArg: Int
  lazy val numer = numerArg / g
  lazy val denom = denomArg / g
  override def toString = numer +"/"+ denom
  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
