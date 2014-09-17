package chapter3

import scala.io.Source;

/**
 * Created by vicboma on 17/09/14.
 */
object File {
  def main (args: Array[String]) {
    val file: Array[String] = Array("README.md")
    printTokens(args)
    printTokens(file)
    printTokensToList(file)
    printTokensToListLinePadding(file)
  }

  private def printTokens(args: Array[String]) {
    if (args.length > 0) {

      for (line <- Source.fromFile(args(0)).getLines)
        print(line.length + " " + line)
    }
    else
      Console.err.println("Please enter filename")
  }

  private def printTokensToList(args: Array[String]) {
    if (args.length > 0) {

      for (line <- Source.fromFile(args(0)).getLines.toList)
        println(line.length + " " + line)
    }
    else
      Console.err.println("Please enter filename")
  }

  private def printTokensToListLinePadding(args: Array[String]) {
    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines.toList
      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
      )
      val maxWidth = widthOfLength(longestLine)

      for (line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + " | " + line)
      }
    }
    else
      Console.err.println("Please enter filename")
  }

  private def widthOfLength(s: String) = s.length.toString.length

}

