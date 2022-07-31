/*
2. Write a program in PatternMatching, takes the integer input from the command line. Based
on the input, write a code using match to print Negative/Zero is input when input is less than or
equal to 0.Print Even number is given when input is even, and print Odd number is given when
input is odd.
*/

object Main extends App {
    print("Enter a number: ");
    val n = scala.io.StdIn.readInt();
    evenOdd(n);

    def evenOdd(n: Int): Unit = {
        n match {
            case n if n <= 0 => println("Negative/Zero");
            case n if n%2 == 0 => println("Even");
            case _ => println("Odd");
        }
    }
}