package chapter6

/**
 * Created by vicboma on 17/09/14.
 */
object Rational {
  def main (args: Array[String]) {
    new Rational(5,6)
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    val z = new Rational(4, 3)
    println()
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    println("add: "+(oneHalf add twoThirds))
    val r = new Rational(1, 2)
    println("demon: "+ r.denom+" numer: "+r.numer)
    val d = new Rational(3)
    new Rational(66, 42)

    val ro = new RationalOverloading(2, 3)
    println(ro * ro)
    println(ro * 2)
  }
}

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n
  val denom: Int = d
  println("Created : "+toString)

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = numer +"/"+ denom
  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

class RationalOverloading(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def + (that: RationalOverloading): RationalOverloading =
    new RationalOverloading(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def + (i: Int): RationalOverloading =
    new RationalOverloading(numer + i * denom, denom)

  def - (that: RationalOverloading): RationalOverloading =
    new RationalOverloading(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def - (i: Int): RationalOverloading =
    new RationalOverloading(numer - i * denom, denom)

  def * (that: RationalOverloading): RationalOverloading =
    new RationalOverloading(numer * that.numer, denom * that.denom)

  def * (i: Int): RationalOverloading =
    new RationalOverloading(numer * i, denom)

  def / (that: RationalOverloading): RationalOverloading =
    new RationalOverloading(numer * that.denom, denom * that.numer)

  def / (i: Int): RationalOverloading =
    new RationalOverloading(numer, denom * i)

  override def toString = numer +"/"+ denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}