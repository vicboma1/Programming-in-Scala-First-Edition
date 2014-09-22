package chapter12

/**
 * Created by vicboma on 22/09/14.
 */
trait CharSequence {
  def charAt(index: Int): Char
  def length: Int
  def subSequence(start: Int, end: Int): CharSequence
  def toString(): String
}
