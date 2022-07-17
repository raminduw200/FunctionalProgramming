object Question {
  def main(args: Array[String]): Unit = {
    print("Enter value 1: ");
    var a = scala.io.StdIn.readInt();
    print("Enter value 2: ");
    var b = scala.io.StdIn.readInt();
    print("Enter value 3: ");
    var c = scala.io.StdIn.readInt();
    
    println("Largest is: " + findLargest(a, b, c));
  }

  def findLargest(a: Int, b: Int, c: Int): Int = {
    if (a > b && a > c)
      return a;
    else if (b > a && b > c)
      return b;
    else
      return c;
  }
}
