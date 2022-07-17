object Question {
  def main(args: Array[String]): Unit = {
    println("Total running time : " + (easyPace(2) + tempoPace(3) + easyPace(2)));
  }

  def easyPace(distance: Int): Double = {
    8 * distance;
  }
  def tempoPace(distance: Int): Double = {
    7 * distance;
  }
}
