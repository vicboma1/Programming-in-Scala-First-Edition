package chapter22

/**
 * Created by vicboma on 06/10/14.
 */
object Fruit {
  def main(args: Array[String]) {
    val apples = new Apple :: Nil
    println("val apples = new Apple :: Nil = "+apples.toString())
    val fruits = new Orange :: apples
    println("val fruits = new Orange :: apples = "+fruits.toString())
  }

  abstract class Fruit
  class Apple extends Fruit
  class Orange extends Fruit
}



/*
final case class ::[T](hd: T, tl: List[T]) extends List[T] {
  def head = hd
  def tail = tl
  override def isEmpty: Boolean = false
}

final case class ::[T](head: T, tail: List[T])
  extends List[T] {
  override def isEmpty: Boolean = false

  def length: Int =
    if (isEmpty) 0 else 1 + tail.length

  def drop(n: Int): List[T] =
    if (isEmpty) Nil
    else if (n <= 0) this
    else tail.drop(n - 1)

  def map[U](f: T => U) : List[U] =
    if (isEmpty) Nil
    else f(head) :: tail.map(f)
}

*/

/*
case object Nil extends List[Nothing] {
  override def isEmpty = true

  def head: Nothing =
    throw new NoSuchElementException("head of empty list")

  def tail: List[Nothing] =
    throw new NoSuchElementException("tail of empty list")
}
*/