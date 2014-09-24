package chapter17

import scala.collection.immutable.Queue
import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * Created by vicboma on 24/09/14.
 */
object Sequences {
  def main (args: Array[String]) {
    SeqList
    SeqArrays
    SeqListBuffer
    SeqArrayBuffer
    SeqQueueInmutable
    SeqQueueMutable
    SeqStacks
  }

  private def SeqStacks{
    val stack = new mutable.Stack[Int]
    stack.push(1)
    println("stack = "+stack.toString())
    stack.push(2)
    println("stack = "+stack.toString())
    println("stack.top = "+stack.top)
    println("stack = "+stack.toString())
    println("stack.pop = "+stack.pop)
    println("stack = "+stack.toString())
  }

  private def SeqQueueMutable{
    val queue = new scala.collection.mutable.Queue[String]
    queue += "a"
    queue ++= List("b", "c")
    println("queue.toString = "+queue.toString())
    println("queue.dequeue = "+queue.dequeue)
    println("queue.toString = "+queue.toString())
  }

  private def SeqQueueInmutable () {
    val empty1 = Queue.empty[Int]
    val has1 = empty1.enqueue(1)
    val has123 = has1.enqueue(List(2, 3))
    println("Queue has123 = "+has123)
    val (element, has23) = has123.dequeue
    println("val (element, has23) = has123.dequeue")
    println("val (element) = "+element)
    println("val (has23) = "+has23)

  }

  private def SeqArrayBuffer {
    val arrayBuf = new ArrayBuffer[Int]()
    arrayBuf += 12
    arrayBuf += 14
    println("arrayBuf.length = " + arrayBuf.length)
    println("arrayBuf(0) = " + arrayBuf(0))
    println("arrayBuf.toString = " + arrayBuf.toString())
    println("arrayBuf.remove(1) = " + arrayBuf.remove(1))
    println("arrayBuf.toString = " + arrayBuf.toString())
  }

  private def SeqListBuffer {
    val listBuf = new ListBuffer[Int]
    listBuf += 1
    listBuf += 2
    listBuf += 3
    4 +: listBuf
    println("buf.toList = " + listBuf.toList)
  }

  private def SeqArrays {
    val fiveInts = new Array[Int](5)
    val fiveToOne = Array(5, 4, 3, 2, 1)
    fiveInts(0) = fiveToOne(4)
    println("fiveInts = " + (fiveInts.foreach(println)))
  }

  private def SeqList {
    val colors = List("Blue", "Yellow", "Green")
    println("colors.head = " + colors.head)
    println("colors.tail = " + colors.tail)
  }
}

