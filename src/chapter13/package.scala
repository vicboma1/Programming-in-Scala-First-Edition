/**
 * Created by vicboma on 22/09/14.
 */

package launch {
  class Booster3
}

package bobsrockets {
package navigation {
  class Navigator

     package tests {
     class NavigatorSuite{
         val nav = new navigation.Navigator
       }
      }
  }

  class MissionControl {
    val booster2 = new bobsrockets.launch.Booster2
    val booster3 = new _root_.launch.Booster3  //Hidden
  }

  package launch {
    class Booster2
  }
}


package bobsdelights {
  abstract class Fruit(val name: String,val color: String)
  object Fruits {
    object Apple extends Fruit("apple", "red")
    object Orange extends Fruit("orange", "orange")
    object Pear extends Fruit("pear", "yellowish")
    val menu = List(Apple, Orange, Pear)

    def showFruit(fruit: Fruit) {
      import fruit._
      println(name +"s are "+ color)
    }
  }

}