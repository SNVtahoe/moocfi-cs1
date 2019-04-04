public class Main {
  public static void main(String[] args) {
    Multiplier three = new Multiplier(3);
    System.out.println("three.multiply(2): " + three.multiply(2));

    Multiplier four = new Multiplier(4);
    System.out.println("four.multiply(2): " + four.multiply(2));

    System.out.println("three.multiply(1): " + three.multiply(1));
    System.out.println("four.multiply(1): " + four.multiply(1));
  }
}

/*
 * public class Multiplier { private int number;
 * 
 * public Multiplier(int otherNumber) { this.number = otherNumber; }
 * 
 * public int multiply(int otherNumber) { return this.number * otherNumber; } }
 */