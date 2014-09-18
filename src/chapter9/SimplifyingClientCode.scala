package chapter9

/**
 * Created by vicboma on 19/09/14.
 */
object SimplifyingClientCode {
  def main(args: Array[String]) {
    var result = isNegative(List(6,5,4,3,-2,3))
    println(result)

    result = _isNegative(List(6,5,4,3,2,3))
    println(result)

    result = containsOdd(List(6,5,4,3,2,3))
    println(result)
  }

  def isNegative(args: List[Int]): Boolean = {
    var result = false
    args.toStream.foreach(
      x =>
        if(x < 0)
          result = true
    )
    result
  }

  def _isNegative(args: List[Int]) =
    args.exists(_ < 0)

  def containsOdd(nums: List[Int]) =
    nums.exists(_ % 2 == 1)

}
