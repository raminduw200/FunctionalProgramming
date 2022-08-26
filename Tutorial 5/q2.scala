object Question2 {
    def primeSeq(n: Int): Unit = {
        Question1.prime(n) match {
            case true => print(n + ", ")
            case false => Question1.prime(n-1)
        }
        if (n > 2) {
            primeSeq(n-1);
        }
    }
    def main(args: Array[String]) : Unit = {
        print("Enter a number :");
        val n = scala.io.StdIn.readInt();
        primeSeq(n);
        println();
    }
}