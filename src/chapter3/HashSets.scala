package chapter3

import scala.collection.immutable.HashSet

/**
 * Created by vicboma on 17/09/14.
 */
object HashSets {
  def main(args: Array[String]) {
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")
  }
}
