package chapter7

/**
 * Created by vicboma on 18/09/14.
 */
object RefactoringImperativeStyleCode {
  def main (args: Array[String]) {
    multiTable
  }

  private def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  private def makeRow(row: Int) = makeRowSeq(row).mkString

  private def multiTable() = {
    val tableSeq = // a sequence of row strings
      for (row <- 1 to 10)
      yield makeRow(row)

    tableSeq.mkString("\n")
  }
}
