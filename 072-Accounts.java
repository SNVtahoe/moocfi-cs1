public class Accounts {
  public static void main(String[] args) {

    /*
     * Exercise 72.1 Account myAccount = new Account("Kimi's ice-cream fund",
     * 100.0); myAccount.deposit(20.0); System.out.println(myAccount);
     */

    /*
     * Exercise 72.2 Account matt = new Account("Matt's account", 1000.0); Account
     * kimi = new Account("My account", 0.0);
     * 
     * matt.withdrawal(100); kimi.deposit(100);
     * 
     * System.out.println(matt); System.out.println(kimi);
     */

    Account account1 = new Account("A", 100.0);
    Account account2 = new Account("B", 0.0);
    Account account3 = new Account("C", 0.0);

    transfer(account1, account2, 50.0);
    transfer(account2, account3, 25.0);

    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account3);
  }

  public static void transfer(Account from, Account to, double howMuch) {
    from.withdrawal(howMuch);
    to.deposit(howMuch);
  }
}