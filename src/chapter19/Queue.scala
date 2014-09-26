package chapter19

/**
 * Created by vicboma on 26/09/14.
 */
object QueueMain {
  def main (args: Array[String]) {
    val init = System.currentTimeMillis()
    val queue = Queue.apply("A","b","C","d")
    println("queue.head = "+queue.head)
    println("queue.tail = "+queue.tail.toString)
    println("queue.append(Z) = "+queue.append("Z").toString)
    val end = System.currentTimeMillis()
    println("Time Ops: "+(end-init))
  }
}

trait Queue[T] {
  def head: T
  def tail: Queue[T]
  def append(x: T): Queue[T]
}

object Queue {

  def apply[T](xs: T*): Queue[T] =
    new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[T](private val leading: List[T],private val trailing: List[T]) extends Queue[T] {

    def mirror() = {
    if (leading.isEmpty)
      new QueueImpl(trailing.reverse, Nil)
    else
      this
  }

    def head(): T = mirror.leading.head

    def tail(): QueueImpl[T] = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def append(x: T) = {
      new QueueImpl(leading, x :: trailing)
    }

    override def toString = ""+leading.toString()+" "+trailing.toString()
  }
}
