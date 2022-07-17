object Question {
  def main(args: Array[String]): Unit = {
    var bookPrice = 24.95;
    var discount = 40;
    var numOfCopies = 60;

    println("Price of " + 60 + " copies are " + totalCost(bookPrice, discount, numOfCopies));
  }

  def applyDiscount(bookPrice: Double, discount: Double, numOfCopies: Double): Double = {
    ((100 - discount) / 100.0) * bookPrice * numOfCopies;
  }

  def shippingCost(numOfCopies: Double): Double = {
    if (numOfCopies <= 50) {
      3;
    } else {
      3 + ((50-numOfCopies) * 0.75);
    }
  }

  def totalCost(bookPrice: Double, numOfCopies: Double, discount: Double): Double = {
    applyDiscount(bookPrice, discount, numOfCopies) + shippingCost(numOfCopies);
  }
}
