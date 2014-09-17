package chapter3;

//Given there are no imports, when you say Map in the first lines, you'll get the default: a scala.collection.immutable.Map
import scala.collection.immutable.HashMap
import scala.collection.mutable.Map

/**
 * Created by vicboma on 17/09/14.
 */
object Maps {
  def main(args: Array[String]) {
    mutable
    inmutable
  }

  private def mutable {
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))
  }

  private def inmutable {
    val romanNumeral = HashMap(
    1 -> "I",
    2 -> "II",
    3 -> "III",
    4 -> "IV",
    5 -> "V"
  )
    println(romanNumeral(4))
    // romanNumeral += (6 -> "VI") fail
    // println(romanNumeral(6)) fail
  }
}
