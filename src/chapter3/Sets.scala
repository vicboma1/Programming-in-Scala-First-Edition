package chapter3;

/**
 * Created by vicboma on 17/09/14.
 */
object Sets {
  def main(args: Array[String]) {
    val attr: String = "!"
    var set = Set("Hello", "World")

    println(set + attr)
    println(set)

    set += attr //Mutable Op
    println(set.contains(attr.toString()))
    println(set)

    set -= attr //Mutable Op
    println(set.contains(attr.toString()))
    println(set)

  }
}
