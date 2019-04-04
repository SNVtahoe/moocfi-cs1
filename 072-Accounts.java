public class Accounts {
  public static void main(String[] args) {
    /*
     * Exercise 72.1 Account myAccount = new Account("Kimi's ice-cream fund",
     * 100.0); myAccount.deposit(20.0); System.out.println(myAccount);
     */

    Account matt = new Account("Matt's account", 1000.0);
    Account kimi = new Account("My account", 0.0);

    matt.withdrawal(100);
    kimi.deposit(100);

    System.out.println(matt);
    System.out.println(kimi);
  }
}