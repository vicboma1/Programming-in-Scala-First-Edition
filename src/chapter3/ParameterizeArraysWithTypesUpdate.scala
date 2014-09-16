package chapter3

/**
 * Created by vicboma on 16/09/14.
 */
object ParameterizeArraysWithTypesUpdate {
  def main(args: Array[String]) {
    val list: Array[String] = Initialize();
    foreach(list)
    toStreamForeach(list)
    forClassic(list)
  }

  private def forClassic(list: Array[String]) {
    var init: Long = CurrentTimeMillis
    for (i <- 0.to(2))
      print(list.apply(i))
    var end = CurrentTimeMillis;
    println("Execute Time for classic: " + (end - init) + " ms")
  }

  private def toStreamForeach(list: Array[String]) {
    var init: Long = CurrentTimeMillis
    list.toStream.foreach(print)
    var end = CurrentTimeMillis;
    println("Execute Time toStream: " + (end - init) + " ms")
  }

  private def foreach(list: Array[String]) {
    var init: Long = CurrentTimeMillis
    list.foreach(print)
    var end = CurrentTimeMillis;
    println("Execute Time foreach: " + (end - init) + " ms")
  }

  private def Initialize(): Array[String] = {
    var init: Long = CurrentTimeMillis

    val list = new Array[String](3)
    list.update(0, "Hello")
    list.update(1, ",")
    list.update(2, " World!")

    var end = CurrentTimeMillis;
    println("Execute Time: " + (end - init) + " ms")
    list
  }

  private def CurrentTimeMillis: Long = {
    var init = System.currentTimeMillis()
    init
  }
  
}
