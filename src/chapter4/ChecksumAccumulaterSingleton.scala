package chapter4

import scala.collection.mutable.Map;

/**
 * Created by vicboma on 17/09/14.
 */
object ChecksumAccumulaterSingleton {
  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache+=(s -> cs)
      cs
    }

}
