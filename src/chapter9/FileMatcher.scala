package chapter9

/**
 * Created by vicboma on 19/09/14.
 */
object FileMatcher {
  def main (args: Array[String]) {
    println(_FileMatcher.filesContaining("md"))
    println(_FileMatcher.filesEnding("ME.md"))
    println(_FileMatcher.filesRegex("ADME"))
  }

  object _FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    private def filesMatching(matcher: String => Boolean) =
      for (file <- filesHere; if matcher(file.getName))
      yield file

     def filesEnding(query: String) =
      filesMatching(s => s.endsWith(query))

     def filesContaining(query: String) =
      filesMatching(_.contains(query))

     def filesRegex(query: String) =
      filesMatching(_.matches(query))
  }
}
