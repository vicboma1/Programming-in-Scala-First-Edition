package chapter19

/**
 * Created by vicboma on 26/09/14.
 */
object QueueBasicaMain {
  def main (args: Array[String]) {
    val init = System.currentTimeMillis()
    val queueBasic = QueueBasic.apply("A","b","C","d")
    println("queueBasic.head = "+queueBasic.head)
    println("queueBasic.tail = "+queueBasic.tail.toString)
    println("queueBasic.append(Z) = "+queueBasic.append("Z").toString)
    val end = System.currentTimeMillis()
    println("Time Ops: "+(end-init))
  }
}

class QueueBasic[T](private val leading: List[T], private val trailing: List[T]) {
  private def mirror =
    if (leading.isEmpty)
      new QueueBasic(trailing.reverse, Nil)
    else
      this

  def head = mirror.leading.head

  def tail = {
    val q = mirror
    new QueueBasic(q.leading.tail, q.trailing)
  }

  def append(x: T) =
    new QueueBasic(leading, x :: trailing)

  override def toString = ""+leading.toString()+" "+trailing.toString()
}

object QueueBasic {
  def apply[T](xs: T*) = new QueueBasic[T](xs.toList, Nil)
}

