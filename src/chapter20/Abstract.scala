package chapter20

/**
 * Created by vicboma on 26/09/14.
 */
trait Abstract {
  type T
  def transform(x: T): T
  val initial: T
  var current: T
}

class Concrete extends Abstract {
  type T = String
  def transform(x: T) = x + x
  val initial = "hi"
  var current = initial
}