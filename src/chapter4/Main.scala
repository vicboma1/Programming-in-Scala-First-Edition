package chapter4

/**
 * Created by vicboma on 17/09/14.
 */
object Main {
  def main (args: Array[String]) {
    val check  = new ChecksumAccumulator
    println("Defined check.Sum:")

    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator

    acc.add(3)
    println("acc: "+acc.checksum())
    println("csa: "+csa.checksum())

    // Won't compile, because acc is a val [ val = inmutable | var = mutable ]
    //acc = new ChecksumAccumulator

    var result = ChecksumAccumulaterSingleton.calculate("Every value is an object.")
    println(result)

  }
}
