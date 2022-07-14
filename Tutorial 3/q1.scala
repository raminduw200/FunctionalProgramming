object Question {
  def main(args: Array[String]): Unit = {
    print("Enter number: ");
    var absVal = scala.io.StdIn.readInt();
    println("Absolute value of " + absVal + " is " + getAbs(absVal));
  }

  def getAbs(absVal: Int): Int = {
    if(absVal < 0)
      return -absVal;
    return absVal; 
  }
}

