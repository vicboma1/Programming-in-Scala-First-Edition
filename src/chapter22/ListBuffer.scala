package chapter22

import scala.collection.mutable.ListBuffer

/**
 * Created by vicboma on 06/10/14.
 */
object ListBuffer {
  def main(args: Array[String]) {

    println("List(0,1,2,3,4,5,6,7,8,9)")
    val list = List(0,1,2,3,4,5,6,7,8,9)
    var init = System.currentTimeMillis();
    var all = _incAll(list)
    var end = System.currentTimeMillis();
    println("_incAll = "+(end-init)+"ms")

    init = System.currentTimeMillis();
    all = incAllList(list)
    end = System.currentTimeMillis();
    println("incAllList = "+(end-init)+"ms")


    init = System.currentTimeMillis();
    all = incAll(list)
    end = System.currentTimeMillis();
    println("incAll = "+(end-init)+"ms")
  }

  def _incAll(xs: List[Int]) : List[Int] = {
    xs match {
      case List() => List()
      case x :: xs1 => x+1 :: _incAll(xs1)
    }
  }

  def incAllList(xs: List[Int]) : List[Int] = {
    var result = List[Int]()
      for (x <- xs) result = result ::: List(x + 1)
      result
    }

  def incAll(xs: List[Int]) : List[Int] = {
    val buf = new ListBuffer[Int]
    for (x <- xs) buf += x + 1
    buf.toList
  }

}
