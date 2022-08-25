object Question1 {
    def prime(n: Int, i: Int=2): Boolean = {
        n match {
            case 1 => return true
            case n % 2==0 => return false
            case _ => prime(n, i-1)
        }
    }
    
    def main(args: Array[String]) : Unit = {
        print("Enter a number : ");
        val n = scala.io.StdIn.readInt();
        println("N is prime: " + prime(n));
    }
}