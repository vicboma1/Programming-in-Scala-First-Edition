package chapter18

/**
 * Created by vicboma on 26/09/14.
 */
class Time {

  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = this.h
  def hour(x: Int) {
    require(0 <= x && x < 24)
    this.h = x
  }

  def minute: Int = this.m
  def minute(x: Int) {
    require(0 <= x && x < 24)
    this.m = x
  }
}