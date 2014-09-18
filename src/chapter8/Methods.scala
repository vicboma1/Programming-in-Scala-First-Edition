package chapter8

import scala.io.Source

/**
 * Created by vicboma on 18/09/14.
 */
object Methods {
  def main (args: Array[String]) {
    LongLines.processFile("README.md", 50)
  }
}

object LongLines{
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    source.getLines().toStream.foreach(x =>
      processLine(filename, width, x)
    )
  }

  private def processLine(filename: String,width: Int, line: String) {
    if (line.length > width)
      println(filename +": "+ line.trim)
  }
}
