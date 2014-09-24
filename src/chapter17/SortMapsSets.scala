package chapter17

import scala.collection.immutable.{TreeSet, TreeMap}

/**
 * Created by vicboma on 24/09/14.
 */
object SortMapsSets {
  def main(args:Array[String]) {
    sets
    maps
  }

  private def sets{
    val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)
    println("TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5) = "+ts.toString())
    val cs = TreeSet('f', 'u', 'n')
    println("TreeSet('f', 'u', 'n') = "+cs.toString())
  }

  private def maps{
    var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')
    println("TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x') = "+tm.toString)
    tm += (2 -> 'x')
    println("tm += (2 -> 'x') = "+tm.toString())
  }
}
