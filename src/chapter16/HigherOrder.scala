package chapter16

/**
 * Created by vicboma on 23/09/14.
 */
object HigherOrder {
  def main(args: Array[String]) {
    println("List(1, 2, 3) map (_ + 1) = " + (List(1, 2, 3).map(_ + 1)))
    val words = List("the", "quick", "brown", "fox")
    println("List(the, quick, brown, fox) -  words map (_.length) = " + (words map (_.length)))
    println("words map (_.toList.reverse.mkString) = " + (words.map(_.toList.reverse.mkString)))
    println("words map (_.toList) = " + (words map (_.toList)))
    println("words flatMap (_.toList) = " + (words flatMap (_.toList)))

    println("List(1,2,3,4,5,6).filter(x => x%2 == 0) = " + (List(1, 2, 3, 4, 5, 6).filter(x => x % 2 == 0)))
    println("List(1,2,3,4,5,6).filter(_%2 == 0) = " + (List(1, 2, 3, 4, 5, 6).filter(x => x % 2 == 0)))
    println("words.filter(_.length == 3) = " + (words.filter(_.length == 3)))
    val partition: (List[Int], List[Int]) = (List(1, 2, 3, 4, 5, 6).partition(_ % 3 == 0))
    println("List(1,2,3,4,5,6).partition(_%3 == 0) = " + partition)
    println("List[0] = " + partition._1 + " List[1] = " + partition._2)
    println("List(1,2,3,4,5,6).find(_%3 == 0) = " + (List(1, 2, 3, 4, 5, 6).find(_ % 3 == 0)))
    println("List(1, 2, 3, -4, 5) takeWhile (_ > 0) = " + (List(1, 2, 3, -4, 5).takeWhile(_ > 0)))
    println("List(1, 2, 3, -4, 5) dropWhile (_ > 0) = " + (List(1, 2, 3, -4, 5) dropWhile (_ > 0)))
    println("List(1, 2, 3, -4, 5) span (_ > 0) = " + (List(1, 2, 3, -4, 5) span (_ > 0)))
    println("List(1, -3, 4, 2, 6).sortWith(_ < _) = "+(List(1, -3, 4, 2, 6).sortWith(_ < _)))
  }
}
