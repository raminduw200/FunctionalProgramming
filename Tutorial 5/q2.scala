// import prime from q1

object Question2 {
    def primeSeq(n: Int): Unit = {
        prime(n) match {
            case true => print(n + ", ")
            case false => prime(n-1)
        }
        if (n > 1) {
            primeSeq(n-1);
        }
    }
    def main(args: Array[String]) : Unit = {
        print("Enter a number :");
        val n = scala.io.StdIn.readInt();
        primeSeq(n);
    }
}