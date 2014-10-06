package chapter23

/**
 * Created by vicboma on 06/10/14.
 */
object Queries {
  case class Book(title: String, authors: String*)

  def main(args: Array[String]) {
    val books: List[Book] =
      List(
        Book(
          "Structure and Interpretation of Computer Programs",
          "Abelson, Harold", "Sussman, Gerald J."
        ),
        Book(
          "Principles of Compiler Design",
          "Aho, Alfred", "Ullman, Jeffrey"
        ),
        Book(
          "Programming in Modula-2",
          "Wirth, Niklaus"
        ),
        Book(
          "Elements of ML Programming",
          "Ullman, Jeffrey"
        ),
        Book(
          "The Java Language Specification", "Gosling, James",
          "Joy, Bill", "Steele, Guy", "Bracha, Gilad"
        )
      )

    var result: List[String] = for (b <- books; a <- b.authors
                                if a startsWith "Gosling")
    yield b.title
    println(result)


    result = for (b <- books; if (b.title indexOf "Program") >= 0)
    yield b.title
    println(result)

    result = for (b1 <- books; b2 <- books if b1 != b2;
         a1 <- b1.authors; a2 <- b2.authors if a1 == a2)
    yield a1
    println(result)

    def removeDuplicates[A](xs: List[A]): List[A] = {
      if (xs.isEmpty) xs
      else
        xs.head :: removeDuplicates(
          xs.tail filter (x => x != xs.head)
        )
    }
  }
}

