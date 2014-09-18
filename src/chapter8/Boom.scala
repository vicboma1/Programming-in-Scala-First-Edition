package chapter8

/**
 * Created by vicboma on 19/09/14.
 */
object Boom {
  def main (args: Array[String]) {
    boom(4)
  }

  private def boom(count:Int){
    println(count)
    if(count == 0)
      throw new Exception("boom!")
    else boom(count-1)
  }
}
