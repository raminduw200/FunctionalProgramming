object Question {
    def main(args: Array[String]): Unit = {
        print("Enter the month: ");
        try {
            var month = scala.io.StdIn.readInt()
            
            println("Season : " + getSeason(month));
        } catch {
            case e: NumberFormatException => println("Invalid input");
        }
    }

    def getSeason(month: Int): String = {
        if (month == 12 || month == 1 || month == 2) "Winter"
        else if (month == 3 || month == 4 || month == 5) "Spring"
        else if (month == 6 || month == 7 || month == 8) "Summer"
        else if (month == 9 || month == 10 || month == 11) "Autumn"
        else "Bogus month"
    }
}