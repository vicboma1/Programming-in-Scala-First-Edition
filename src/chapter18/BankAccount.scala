package chapter18

/**
 * Created by vicboma on 26/09/14.
 */
object BankAccount {
    def main (args: Array[String]) {
      val account = new BankAccount
      println("account.deposit(100)"+account.deposit(100))
      println("account.withdraw(80) = "+account.withdraw(80))
      println("account.withdraw(80) = "+account.withdraw(80))
  }
}


class BankAccount {

  private var bal: Int = 0

  def balance: Int = bal

  def deposit(amount: Int) {
    require(amount > 0)
    bal += amount
  }

  def withdraw(amount: Int): Boolean =
    if (amount > bal) false
    else {
      bal -= amount
      true
    }
}

