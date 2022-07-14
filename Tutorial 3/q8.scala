object Question {
    def main(args: Array[String]): Unit = {
        print("Enter temperature: ");
        try {
            var input = scala.io.StdIn.readInt()
            
            println("celcius : " + celciusToFahrenheit(input));
            println("fahrenheit : " + fahrenheitToCelcius(input));
        } catch {
            case e: NumberFormatException => println("Invalid input");
        }
    }

    def celciusToFahrenheit(celcius: Double): Double = {
        (celcius * 9 / 5) + 32;
    }

    def fahrenheitToCelcius(fahrenheit: Double): Double = {
        (fahrenheit - 32) * 5 / 9;
    }
        
}