package chapter21

import chapter21.JoesPrefs._

/**
 * Created by vicboma on 05/10/14.
 */
object Prompt {
  def main(args: Array[String]) {
    Greeter.greet("Joe")(prompt, drinks)

    Greeter.greet("Joe")
  }
}

object JoesPrefs {
  implicit val prompt = new PreferredPrompt("Yes, master> ");
  implicit val drinks = new PreferredDrink("tea");
}

object Greeter {
  def greet(name: String)(implicit prompt: PreferredPrompt, drink: PreferredDrink) {
    println("Welcome, "+ name +". The system is ready.")
    print("But while you work, ")
    println("why not enjoy a cup of "+ drink.preference +"?")
    println(prompt.preference)
  }
}

class PreferredPrompt(val preference: String)
class PreferredDrink(val preference: String)