package chapter4

/**
 * Created by vicboma on 17/09/14.
 */
class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}
