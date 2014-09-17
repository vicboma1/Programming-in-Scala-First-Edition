package chapter4

/**
 * Created by vicboma on 17/09/14.
 */
object AppTrait{
  def main (args: Array[String]) {
    appTrait
  }

  private def appTrait {
    val season = List("fall", "winter", "spring")
    season.foreach(
      x => println(x + ": " + ChecksumAccumulaterSingleton.calculate(x))
    )
  }
}
