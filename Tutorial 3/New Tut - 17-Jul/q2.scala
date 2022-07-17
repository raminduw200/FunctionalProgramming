object Question {
  def main(args: Array[String]): Unit = {
    var input = 35;
    println("celcius : " + celciusToFahrenheit(input));
  }

  def celciusToFahrenheit(celcius: Double): Double = {
    (celcius * 9 / 5) + 32;
  }
}
