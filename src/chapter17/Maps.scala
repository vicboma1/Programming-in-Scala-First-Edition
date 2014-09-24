package chapter17

/**
 * Created by vicboma on 24/09/14.
 */
object Maps {
  def main(args: Array[String]) {
    mapsImmutable
    mapsMutable
  }

  private def mapsImmutable {
    val nums = Map("i" -> 1, "ii" -> 2)
    println("Map(i -> 1,ii -> 2) = " + nums.toString())
    nums + ("vi" -> 6)
    println("nums + (vi -> 6) = " + nums.toString())
    nums - "ii"
    println("nums - ii = " + nums.toString())
    nums ++ List("iii" -> 3, "v" -> 5)
    println("nums ++ List(iii -> 3, v -> 5) = " + nums.toString())
    nums -- List("i", "ii")
    println("nums -- List(i,ii) = " + nums.toString())
    println("nums.size = " + nums.size)
    println("nums.contains(ii) = " + (nums.contains("ii")))
    println("nums(ii) = " + nums("ii"))
    println("nums.keys = " + nums.keys)
    println("nums.keySet = " + nums.keySet)
    println("nums.values = " + nums.values)
    println("nums.isEmpty = " + nums.isEmpty)
    println("nums.foreach(println) = " +(nums.foreach(println)))
  }

  private def mapsMutable {
    val words = scala.collection.mutable.Map.empty[String, Int]
    println("words += (\"one\" -> 1) = " + (words += ("one" -> 1)))
    println("words -= \"one\" = " + (words -= "one"))
    println("words ++= List(\"one\" -> 1, \"two\" -> 2, \"three\" -> 3) = " + (words ++= List("one" -> 1, "two" -> 2, "three" -> 3)))
    println("words --= List(\"one\", \"two\") = " + (words --= List("one", "two")))
  }
}
