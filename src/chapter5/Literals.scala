package chapter5

import chapter5.Literals._

/**
 * Created by vicboma on 17/09/14.
 */
object Main {

  def main (args: Array[String]) {
    hexadecimal(0x60)
    hexadecimal(0x00FF)
    hexadecimal(0xcafebabe)

    character("\101")
    character("\121")
    character("\143")
    character("\50")
  }

  def character(value:String) {
    println(toString(Literals.character,value))
  }

  def hexadecimal(value:Int) {
    println(toString(Literals.hex,value.toString))
  }

  def toString(literal:String,arg: String): String = {
    literal + Literals.pre + arg
  }

}

object Literals{
  var pre = ": "
  var hex = "Hex"
  var character = "character"
}
