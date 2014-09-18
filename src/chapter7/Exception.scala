package chapter7

import java.io.{IOException, FileNotFoundException, FileReader}

/**
 * Created by vicboma on 18/09/14.
 */
object Exception {
  def main (args: Array[String]) {
    catchException
    runException(1)
  }

  private def runException(n : Int) {
    val half =
      if (n % 2 == 0)
        n / 2
      else
        throw new RuntimeException("must be even")
  }

  private def catchException {
    //val f = new FileReader("input.txt")

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => println("// Handle missing file")
      case ex: IOException => println("// Handle other I/O error")
    }
    finally {
    //  f.close()
    }
  }
}
