object Question5 {
    def evenSum(n: Int, sum: Int=0): Int = {
        if (n == 0) return sum
        else if(Question4.isEven(n)) evenSum(n-1, sum+n);
        else evenSum(n-1, sum);
    }
    def main(args: Array[String]): Unit = {
        print("Enter a number : ");
        val n = scala.io.StdIn.readInt();
        println("Sum of even numbers: " + evenSum(n));
    }
}