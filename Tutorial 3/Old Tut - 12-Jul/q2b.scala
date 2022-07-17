object Question {
  def main(args: Array[String]): Unit = {
    print("Enter value 1: ");
    var a = scala.io.StdIn.readInt();
    print("Enter value 2: ");
    var b = scala.io.StdIn.readInt();
    
    println("Largest is: " + findLargest(a, b));
  }

  def findLargest(a: Int, b: Int): Int = {
    if (a > b) a else b;
  }
}
