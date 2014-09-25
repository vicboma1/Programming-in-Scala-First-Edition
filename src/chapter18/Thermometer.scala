package chapter18

/**
 * Created by vicboma on 26/09/14.
 */
object Thermometer{
  def main (args: Array[String]) {
    val temperature  = new Thermometer
    println(temperature.toString)
    temperature.celsius(100)
    println("temperature.celsius(100) = "+temperature.toString)
    temperature.fahrenheit(-40)
    println("temperature.fahrenheit(-40) = "+temperature.toString)

  }
}

class Thermometer {

  private[this] var celsius: Float = _  //More precisely, an initializer "= _" of a field assigns a zero value to that field.

  def celsius(c:Float){
    this.celsius = c
  }
  def fahrenheit = this.celsius * 9 / 5 + 32
  def fahrenheit(f: Float) {
    this.celsius = (f - 32) * 5 / 9
  }

  override def toString = fahrenheit +"F/"+ this.celsius +"C"
}