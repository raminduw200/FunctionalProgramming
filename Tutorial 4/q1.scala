/*
1. Develop the function of interest. It consumes a deposit amount and produces the actual
amount of interest that the money earns in a year. The bank pays a flat 2% for deposits of up to
Rs. 20 000, a flat 4% per year for deposits of up to Rs. 200000, a flat 3.5% per year for deposits
of up to Rs. 2000000, and a flat 6.5% for deposits of more than Rs. 200000.
*/

object Main extends App {
    print("Enter the deposit amount: ");
    val depositAmount = scala.io.StdIn.readDouble();
    println("The interest earned is: " + interest(depositAmount));

    def interest(deposit: Double): Double = {
        if (deposit <= 20000) {
            deposit * 0.02
        } else if (deposit <= 200000) {
            deposit * 0.04
        } else if (deposit <= 2000000) {
            deposit * 0.035
        } else {
            deposit * 0.065
        }
    }
}