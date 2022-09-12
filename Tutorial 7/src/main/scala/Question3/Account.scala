package Question3

class Account(id:String,n:Int,b:Double) {
  private var nic:String = id;
  private var acnumber:Int = n;
  private var balance:Double = b;

  def deposit(amount: Double): Unit = {
    balance += amount;
  }

  def withdraw(amount: Double): Unit = {
    balance -= amount;
  }

  def transfer(amount: Double, another: Account): Unit = {
    this.withdraw(amount);
    another.deposit(amount);
  }

  def interest(): Unit = {
    if (balance >= 0) balance += balance * 0.05;
    else balance += balance * 0.1;
  }

  def getBalance: Double = balance;

  override def toString: String = "Account : " + nic + " Balance: " + balance;
}
