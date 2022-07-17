object Question {
  val PI = 22/7;

  def main(args: Array[String]): Unit = {
    var r = 5;
    println("Area of the circle " + r + " is " + getVolume(r));
  }

  def getVolume(r: Int): Double = {
    (4/3)*PI*r*r*r;
  }
}
