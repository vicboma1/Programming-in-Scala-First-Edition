package chapter21

/**
 * Created by vicboma on 05/10/14.
 */
object MaxListImp {
  def main(args: Array[String]) {
    println("maxListImpParm(List(1,5,10,3)) = "+ maxListImpParm(List(1,5,10,3)))
    println("maxListImpParm List(1.5, 5.2, 10.7, 3.14159) = "+maxListImpParm(List(1.5, 5.2, 10.7, 3.14159)))
    println("maxListImpParm(List(\"one\", \"two\", \"three\")) = "+maxListImpParm(List("one", "two", "three")))
  }

  def maxListImpParm[T](elements: List[T])(implicit orderer: T => Ordered[T]): T =
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListImpParm(rest)(orderer)
        if (orderer(x) > maxRest) x
        else maxRest
    }

}

