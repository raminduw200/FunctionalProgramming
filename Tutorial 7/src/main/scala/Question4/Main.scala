package Question4

import Question3.Account

object Main extends App {
  var accounts: List[Account] = new Account("1", 1, 1000) :: new Account("2", 2, 2000) :: new Account("3", 3, 3000) :: new Account("4", 4, -1000) :: Nil

  var overdraft: List[Account] = accounts.filter(x => x.getBalance < 0).toList;

  println("Overdraft Accounts: ");
  overdraft.foreach(x => println(x));

  var balance: Double = accounts.map(x => x.getBalance).reduce((x, y) => x + y);

  println("Total Balance: " + balance);

  accounts.foreach(x => x.interest());

  println("Interest: ");
  accounts.foreach(x => println(x));
}
