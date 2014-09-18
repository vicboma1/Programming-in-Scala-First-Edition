package chapter7

/**
 * Created by vicboma on 18/09/14.
 */
object WhileLoops {
  def main (args: Array[String]) {
    var gcd = gcdLoop(2,3)
    println(gcd)
    to
    until
    grep(".*gcd.*")
  }

  private def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  private def to{
    for (i <- 1 to 4)
      println("Iteration "+ i)
  }

  private def until {
    for (i <- 1 until 4)
      println("Iteration "+ i)
  }

  private def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList

  private def grep(pattern: String) {
    val filesHere = (new java.io.File(".")).listFiles
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + trimmed)
  }
}
