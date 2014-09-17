package chapter5

/**
 * Created by vicboma on 17/09/14.
 */
object RelationalAndLogicalOperations {
    def main (args: Array[String]) {
      val toBe = true;
      println(1 > 2)
      println(1 < 2)
      println(1.0 <= 1.0)
      println(3.5f >= 3.6f)
      println('a' >= 'A')
      println(!true)
      println(!false)
      println( toBe || !toBe)
      println( toBe && !toBe)
    }
  }
