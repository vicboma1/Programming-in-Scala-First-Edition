package chapter20

/**
 * Created by vicboma on 27/09/14.
 */
object MainCurrency{
  def main(args: Array[String]) {
    val currencyJapan: Japan.Currency = Japan.Yen from US.Dollar * 100
    println("currencyJapan = "+currencyJapan)
    val currencyEurope: Europe.Currency = Europe.Euro from currencyJapan
    println("currencyEurope = "+currencyEurope)
    val currencyUS: US.Currency = US.Dollar from currencyEurope
    println("currencyUS = "+currencyUS)
    println("US.Dollar * 100 + currencyUS = "+US.Dollar * 100 + currencyUS)
  }
}

abstract class CurrencyZone {

  type Currency <: AbstractCurrency
  def make(x: Long): Currency

  abstract class AbstractCurrency {

    val amount: Long
    def designation: String

    def + (that: Currency): Currency =
      make(this.amount + that.amount)
    def * (x: Double): Currency =
      make((this.amount * x).toLong)
    def - (that: Currency): Currency =
      make(this.amount - that.amount)
    def / (that: Double) =
      make((this.amount / that).toLong)
    def / (that: Currency) =
      this.amount.toDouble / that.amount

    def from(other: CurrencyZone#AbstractCurrency): Currency =
      make(Math.round(
        other.amount.toDouble * Converter.exchangeRate
          (other.designation)(this.designation)))

    private def decimals(n: Long): Int =
      if (n == 1) 0 else 1 + decimals(n / 10)

    override def toString =
      ((amount.toDouble / CurrencyUnit.amount.toDouble)
        formatted ("%."+ decimals(CurrencyUnit.amount) +"f")
        +" "+ designation)
  }

  val CurrencyUnit: Currency
}

object US extends CurrencyZone {

  abstract class Dollar extends AbstractCurrency {
    def designation = "USD"
  }

  type Currency = Dollar

  def make(cents: Long) = new Dollar {
    val amount = cents
  }

  val Cent = make(1)
  val Dollar = make(100)
  val CurrencyUnit = Dollar
}

object Europe extends CurrencyZone {

  abstract class Euro extends AbstractCurrency {
    def designation = "EUR"
  }

  type Currency = Euro

  def make(cents: Long) = new Euro {
    val amount = cents
  }

  val Cent = make(1)
  val Euro = make(100)
  val CurrencyUnit = Euro
}

object Japan extends CurrencyZone {

  abstract class Yen extends AbstractCurrency {
    def designation = "JPY"
  }

  type Currency = Yen

  def make(yen: Long) = new Yen {
    val amount = yen
  }

  val Yen = make(1)
  val CurrencyUnit = Yen
}

object Converter {
  var exchangeRate = Map(
    "USD" -> Map("USD" -> 1.0   , "EUR" -> 0.7596,
      "JPY" -> 1.211 , "CHF" -> 1.223),
    "EUR" -> Map("USD" -> 1.316 , "EUR" -> 1.0   ,
      "JPY" -> 1.594 , "CHF" -> 1.623),
    "JPY" -> Map("USD" -> 0.8257, "EUR" -> 0.6272,
      "JPY" -> 1.0   , "CHF" -> 1.018),
    "CHF" -> Map("USD" -> 0.8108, "EUR" -> 0.6160,
      "JPY" -> 0.982 , "CHF" -> 1.0  )
  )
}
