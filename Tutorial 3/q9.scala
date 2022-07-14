object Question {
    def main(args: Array[String]): Unit = {
        print("Enter +,-,*,/ to perform: ");
        var operator = scala.io.StdIn.readChar()

        try {
            print("Number 1: ");
            var num1 = scala.io.StdIn.readInt()
            print("Number 2: ");
            var num2 = scala.io.StdIn.readInt()
            
            println(num1 + " " + operator + " " + num2 + " = " + calculator(num1, num2, operator));
        } catch {
            case e: NumberFormatException => println("Invalid input");
        }
    }

    def calculator(num1: Int, num2: Int, operator: Char): Int = {
        operator match {
            case '+' => num1 + num2
            case '-' => num1 - num2
            case '*' => num1 * num2
            case '/' => num1 / num2
            case _ => 0
        }
    }
}