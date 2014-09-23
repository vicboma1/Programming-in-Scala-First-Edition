package chapter16

/**
 * Created by vicboma on 23/09/14.
 */
object Sort {
  def main(args:Array[String]){
    var time = System.currentTimeMillis();
    val list = List(0,3,1,22,99,99,22,3,1,0)
    println(list)
    val result = isort(list)
    var time2 = System.currentTimeMillis();
    println("sort: "+result+" "+(time2-time)+"ms")

    time = System.currentTimeMillis();
    val listMatch = List(0,3,1,22,99,99,22,3,1,0)
    println(listMatch)
    val resultMatch = isort(listMatch)
    time2 = System.currentTimeMillis();
    println("sortMatch: "+result+" "+(time2-time)+"ms")
  }

  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

  def insert(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)

  def isortMatch(xs: List[Int]): List[Int] = xs match {
    case List()   => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  def insertMatch(x: Int, xs: List[Int]): List[Int] = xs match {
    case List()  => List(x)
    case y :: ys => if (x <= y) x :: xs
    else y :: insert(x, ys)
  }
}
