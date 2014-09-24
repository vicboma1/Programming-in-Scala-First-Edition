package chapter17

import java.util.concurrent.{Callable, ConcurrentHashMap}

import scala.collection.mutable

/**
 * Created by vicboma on 24/09/14.
 */
object Synchronized {
  def main(args: Array[String]) {

    val _makeMapDeprecated = makeMapDeprecated
    val _makeMapSyncronized = makeMapSyncronized

    implicit def funcToCallable[A](func: () => A): Callable[A] = new Callable[A] {
      println("creating callable");
      def call(): A = func()
    }

    implicit def funcToRunnable(func: () => Unit) = new Runnable() {
      println("creating runnable");
      def run() = func()
    }

    _makeMapSyncronized.put("one",1)
    _makeMapSyncronized.put("two",2)
    new Thread(() => run(_makeMapSyncronized,11)).start
    new Thread(() => run(_makeMapSyncronized,22)).start
    _makeMapSyncronized.put("three",3)
    new Thread(() => run(_makeMapSyncronized,33)).start
    _makeMapSyncronized.put("four",4)
    new Thread(() => run(_makeMapSyncronized,44)).start
    _makeMapSyncronized.put("five",5)
    println(_makeMapSyncronized.toString)
  }

  def run(map:ConcurrentHashMap[String, Int], append:Int) = {
    map.put("new value",append)
    println("Map "+map.toString)
  }


  def makeMapDeprecated: mutable.HashMap[String, String] with mutable.SynchronizedMap[String, String] {def default(key: String): String} = {

    new mutable.HashMap[String, String] with
      mutable.SynchronizedMap[String, String] {

      override def default(key: String) =
        "Why do you want to know?"
    }
  }

  def makeMapSyncronized: ConcurrentHashMap[String, Int] = {
    new ConcurrentHashMap[String, Int]()
  }

}
