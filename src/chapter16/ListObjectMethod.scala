package chapter16

/**
 * Created by vicboma on 23/09/14.
 */
object ListObjectMethod {
  def main (args: Array[String]) {
    println("List.apply(1, 2, 3) = "+(List.apply(1, 2, 3)))
    println("List.range(1, 5) = "+(List.range(1,5)))
    //println("List.make(5, 'a') = "+ List.make(5, 'a')) // not working with Intellij
    //println("List.flatten(List(List('a', 'b'), List('c'), List('d', 'e'))) = "+(List.flatten(List(List('a', 'b'), List('c'), List('d', 'e'))))) //not working with Intellij
  }
}
