package chapter12

import scala.collection.mutable.ArrayBuffer

/**
 * Created by vicboma on 22/09/14.
 */
abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf+= x }
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

class PersonalQueue extends BasicIntQueue with Doubling{

}

object mainQueue{
  def main (args: Array[String]) {
    val queue = new BasicIntQueue
    queue.put(10)
    queue.put(20)

    println("get()= "+queue.get()+" get()= "+queue.get())
    //queue.get()

    val personalQueue = new PersonalQueue
    personalQueue.put(10)
    println(personalQueue.get())
  }
}