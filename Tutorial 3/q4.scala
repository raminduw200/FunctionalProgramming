object Question {
    def main(args: Array[String]): Unit = {
        print("Enter a number: ");
        var n = scala.io.StdIn.readInt();
        if (n % 2 == 0)
            println(n + " is even.");
        else
            println(n + " is odd.");
    }
}