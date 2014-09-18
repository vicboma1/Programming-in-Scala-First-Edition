package chapter8

import scala.io.Source

/**
 * Created by vicboma on 18/09/14.
 */
object LocalFunctions {
  def main (args: Array[String]) {
    processFile("README.md", 10)
  }

  def processFile(filename: String, width: Int) {
    def processLine(filename: String,width: Int, line: String) {  //inline
      if (line.length > width)
        println(filename +": "+ line)
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines) {
      processLine(filename, width, line)
    }
  }
}
