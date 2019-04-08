public class Main {
  public static void main(String[] args) {
    CashRegister unicafeExactum = new CashRegister();
    System.out.println(unicafeExactum);

    LyyraCard cardOfJim = new LyyraCard(2);

    System.out.println("the card balance " + cardOfJim.balance() + " euros");

    boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
    System.out.println("payment success: " + succeeded);

    unicafeExactum.loadMoneyToCard(cardOfJim, 100);

    succeeded = unicafeExactum.payGourmet(cardOfJim);
    System.out.println("payment success: " + succeeded);

    System.out.println("the card balance " + cardOfJim.balance() + " euros");

    System.out.println(unicafeExactum);
  }
}

/*
 * public class CashRegister { private double cashInRegister; // the amount of
 * cash in the register private int economicalSold; // the amount of economical
 * lunches sold private int gourmetSold; // the amount of gourmet lunches sold
 * 
 * public CashRegister() { this.cashInRegister = 1000; this.economicalSold = 0;
 * this.gourmetSold = 0; }
 * 
 * public double payEconomical(double cashGiven) { // the price of the
 * economical lunch is 2.50 euros // if the given cash is at least the price of
 * the lunch: // the price of lunch is added to register // the amount of the
 * sold lunches is incremented by one // the method returns cashGiven - lunch
 * price // if not enough money is given, all is returned and nothing else
 * happens
 * 
 * if (cashGiven >= 2.50) { this.cashInRegister += 2.50; this.economicalSold++;
 * 
 * return cashGiven - 2.50; } else { return cashGiven; } }
 * 
 * public double payGourmet(double cashGiven) { // the price of the gourmet
 * lunch is 4.00 euros // if the given cash is at least the price of the lunch:
 * // the price of lunch is added to the register // the amount of the sold
 * lunches is incremented by one // the method returns cashGiven - lunch price
 * // if not enough money is given, all is returned and nothing else happens
 * 
 * if (cashGiven >= 4.0) { this.cashInRegister += 4.0; this.gourmetSold++;
 * 
 * return cashGiven - 4.0; } else { return cashGiven; } }
 * 
 * public boolean payEconomical(LyyraCard card) { if (card.balance() >= 2.50) {
 * card.pay(2.50); this.economicalSold++;
 * 
 * return true; } else { return false; } }
 * 
 * public boolean payGourmet(LyyraCard card) { if (card.balance() >= 4.00) {
 * card.pay(4.00); this.gourmetSold++;
 * 
 * return true; } else { return false; } }
 * 
 * public void loadMoneyToCard(LyyraCard card, double sum) { if (sum >= 0.0) {
 * card.loadMoney(sum); this.cashInRegister += sum; } }
 * 
 * public String toString() { return "money in register " + cashInRegister +
 * " economical lunches sold: " + economicalSold + " gourmet lunches sold: " +
 * gourmetSold; } }
 */

/*
 * public class LyyraCard { private double balance;
 * 
 * public LyyraCard(double balance) { this.balance = balance; }
 * 
 * public double balance() { return this.balance; }
 * 
 * public void loadMoney(double amount) { this.balance += amount; }
 * 
 * public boolean pay(double amount) { // the method checks if the balance of
 * the card is at least the amount given as // parameter // if not, the method
 * returns false meaning that the card could not be used for // the payment //
 * if the balance is enough, the given amount is taken from the balance and true
 * // is returned
 * 
 * if (this.balance >= amount) { this.balance -= amount;
 * 
 * return true; } else { return false; }
 * 
 * } }
 */