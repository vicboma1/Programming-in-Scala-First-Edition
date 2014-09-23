package chapter16

/**
 * Created by vicboma on 23/09/14.
 */
object FirstOrder {
  def main(args:Array[String]){
    println(List(1, 2) ::: List(3, 4, 5))
    println(List() ::: List(1, 2, 3))
    println(List(1, 2, 3) ::: List(4))

    val expected = List(1,2,3,4,5,6)
    val x = List(1,2,3,4)
    val y = List(5,6)
    val result = append(x,y)
    println("append: "+result+" assert: "+(expected == result))
    println("List(1, 2, 3) length: "+List(1, 2, 3).length)

    val abcde = List('a', 'b', 'c', 'd', 'e')
    println("List('a', 'b', 'c', 'd', 'e') last: "+abcde.last)
    println("List('a', 'b', 'c', 'd', 'e') init: "+abcde.init)
    var timeInit = System.currentTimeMillis()
    val abcRes = abcde.reverse
    var timeEnd = System.currentTimeMillis()
    println("List('a', 'b', 'c', 'd', 'e') reverse: "+abcRes+" "+((timeEnd-timeInit)))

    timeInit = System.currentTimeMillis()
    val rev = List ('a', 'b', 'c', 'd', 'e')
    val resReverse = reverseRecursive(rev)
    timeEnd = System.currentTimeMillis()
    println(resReverse+" "+(timeEnd-timeInit))

    println("abcde take 2 = "+(abcde take 2))
    println("abcde drop 2 = "+(abcde drop 2))
    println("abcde splitAt 2 = "+(abcde splitAt 2))
    println("abcde.indices zip abcde = "+(abcde.indices zip abcde))
    println("abcde zip List(1, 2, 3) = "+(abcde zip List(1, 2, 3)))
    println("abcde.zipWithIndex = "+( abcde.zipWithIndex))
    println("abcde.toString = "+(abcde.toString))
    println("abcde mkString (\"List(\", \", \", \")\") = "+(abcde.mkString ("List(", ", ", ")")))

    val arr = abcde.toArray
    println(arr.toString)
    println(arr.toList)
  }


  def append[T](xs: List[T], ys: List[T]): List[T] = {
    xs match {
      case List()  => ys
      case x::xs1 => x::append(xs1,ys)
    }
  }


  def reverseRecursive[T](xs : List[T]) : List[T] = {
    xs match {
      case List() =>  xs
      case x::xs1 => reverseRecursive(xs1):::List(x)
    }
  }
}
