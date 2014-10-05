package chapter21;
/**
 * Created by vicboma on 05/10/14.
 */
object Rules {
  def main(args: Array[String]) {
    println("intToString(10) : "+intToString(10))
    println("doubleToInt(10.3) : "+doubleToInt(10.3))

    val _any2ArrowAssoc = any2ArrowAssoc(1)
    val -> : (Int, String) = _any2ArrowAssoc.->("one")
    println("any2ArrowAssoc 1 -> one"+(->.toString()))

    val bobsPrompt = new PreferredPrompt("relax> ")
    Greeter.greet("Bob")(bobsPrompt)

    Greeter.greet("Joe")(bobsPrompt)
  }

  implicit def intToString(x: Int) = x.toString
  implicit def doubleToInt(x: Double) = x.toInt
}


object Predef {
  class ArrowAssoc[A](x: A) {
    def -> [B](y: B): Tuple2[A, B] = Tuple2(x, y)
  }
  implicit def any2ArrowAssoc[A](x: A): ArrowAssoc[A] =
    new ArrowAssoc(x)
}


class PreferredPrompt(val preference: String)

object Greeter {
  def greet(name: String)(implicit prompt: PreferredPrompt) {
    println("Welcome, "+ name +". The system is ready.")
    println(prompt.preference)
  }
}

object JoesPrefs {
  implicit val prompt = new PreferredPrompt("Yes, master> ")
}