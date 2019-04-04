public class Accounts {
  public static void main(String[] args) {
    Account myAccount = new Account("Kimi's ice-cream fund", 100.0);
    myAccount.deposit(20.0);
    System.out.println(myAccount);
  }
}