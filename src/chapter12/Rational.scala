package chapter12

/**
 * Created by vicboma on 22/09/14.
 */
trait Ordered[T] {
  def compare(that: T): Int

  def <(that: T): Boolean = (this compare that) < 0
  def >(that: T): Boolean = (this compare that) > 0
  def <=(that: T): Boolean = (this compare that) <= 0
  def >=(that: T): Boolean = (this compare that) >= 0
}

class Rational(n: Int, d: Int) extends Ordered[Rational] {
  val numer = n
  val denom = d

  def compare(that: Rational) =
    (this.numer * that.denom) - (that.numer * this.denom)
}

object mainRational {
  def main (args: Array[String]) {
    val half = new Rational(1, 2)
    val third = new Rational(1, 3)

    println(half < third)
    println(half > third)
  }
}