package chapter7

/**
 * Created by vicboma on 18/09/14.
 */
object ForExpressions {
  def main(args: Array[String]) {
    files
  }

  private def files {
    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere)
      println(file)
  }
}
