public class Main {
  public static void main(String[] args) {
    // Money r1 = new Money(7, 50);
    // Money r2 = new Money(1, 60);
    // Money r3 = r1.plus(r2);

    // System.out.println(r3);
    Money r1 = new Money(1, 0);
    Money r2 = new Money(1, 50);
    Money r3 = new Money(-3, 5);
    Money r4 = new Money(2, 0);

    System.out.println(r1.less(r2));
  }
}

/*
 * public class Money {
 * 
 * private final int euros; private final int cents;
 * 
 * public Money(int euros, int cents) {
 * 
 * if (cents > 99) { euros += cents / 100; cents %= 100; }
 * 
 * this.euros = euros; this.cents = cents; }
 * 
 * public int euros() { return euros; }
 * 
 * public int cents() { return cents; }
 * 
 * public Money plus(Money added) { int euroAdd = this.euros + added.euros();
 * int centAdd = this.cents + added.cents();
 * 
 * if (centAdd > 100) { while (centAdd > 100) { centAdd -= 100; euroAdd++; } }
 * 
 * System.out.println(euroAdd + " " + centAdd);
 * 
 * return new Money(euroAdd, centAdd); }
 * 
 * public Money minus(Money decremented) { int euroDec = this.euros -
 * decremented.euros(); int centDec = this.cents - decremented.cents();
 * 
 * if (euroDec > 0 && centDec < 0) { euroDec--; int newCentDec = 100 + centDec;
 * 
 * return new Money(euroDec, newCentDec); }
 * 
 * if ((euroDec == 0 || euroDec < 0) || centDec < 0) { return new Money(0, 0); }
 * 
 * return new Money(euroDec, centDec); }
 * 
 * public boolean less(Money compared) { if (this.euros == compared.euros() &&
 * this.cents < compared.cents()) { return true; }
 * 
 * return this.euros < compared.euros; }
 * 
 * public String toString() { String zero = ""; if (cents < 10) { zero = "0"; }
 * 
 * return euros + "." + zero + cents + "e"; } }
 */