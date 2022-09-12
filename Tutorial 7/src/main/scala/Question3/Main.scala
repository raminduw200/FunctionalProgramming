package Question3

object Main extends App{
  var acc1 = new Account("1234", 2222, 1000);
  var acc2 = new Account("1235", 3333, 2000);

  println("Account 1: " + acc1.getBalance);
  println("Account 2: " + acc2.getBalance);

  println("Transfer 500 from Account 1 to Account 2");
  acc1.transfer(500, acc2);

  println("Account 1: " + acc1.getBalance);
  println("Account 2: " + acc2.getBalance);
}
