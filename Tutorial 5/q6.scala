object Question6 {
    def fibonacci(n: Int, a: Int=0, b: Int=1): Int = {
        if(n >= 0) {
            print(a + " ")
            fibonacci(n-1, b, a+b)
        } else return -1
    }
    def fibSeq(n: Int): Unit = {
        print(fibonacci(n) + " ")
    }

    def main(args: Array[String]): Unit = {
        print("Enter a number : ");
        val n = scala.io.StdIn.readInt();
        fibonacci(n)
    }
}