package chapter20

/**
 * Created by vicboma on 26/09/14.
 */
trait AbstractTime_ {
var hour: Int
var minute: Int
}

trait AbstractTime {
  def hour: Int
  def hour(x: Int)
  def minute: Int
  def minute(x: Int)
}