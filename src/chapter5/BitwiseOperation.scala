package chapter5

/**
 * Created by vicboma on 17/09/14.
 */
object BitwiseOperation {
  def main (args: Array[String]) {
    println(1 & 2)
    println(1 | 2)
    println(1 ^ 3)
    println( ~1)
    println(-1 >> 31)
    println(-1 >>> 31)
    println(1 << 2)
  }
}