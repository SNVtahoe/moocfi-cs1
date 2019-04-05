import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    BoundedCounter seconds = new BoundedCounter(59);
    BoundedCounter minutes = new BoundedCounter(59);
    BoundedCounter hours = new BoundedCounter(23);

    System.out.print("seconds: ");
    int s = Integer.parseInt(reader.nextLine());
    System.out.print("minutes: ");
    int m = Integer.parseInt(reader.nextLine());
    System.out.print("hours: ");
    int h = Integer.parseInt(reader.nextLine());

    seconds.setValue(s);
    minutes.setValue(m);
    hours.setValue(h);

    int i = 0;
    while (i < 121) {
      System.out.println(hours + ":" + minutes + ":" + seconds);

      seconds.next();

      if (seconds.getValue() == 0) {
        minutes.next();
      }

      if (minutes.getValue() == 0 && seconds.getValue() == 0) {
        hours.next();
      }

      i++;
    }
  }
}

/*
 * public class BoundedCounter { private int value; private int upperLimit;
 * 
 * public BoundedCounter(int upperLimit) { this.upperLimit = upperLimit;
 * this.value = 0; }
 * 
 * public void next() { this.value++;
 * 
 * if (this.value > this.upperLimit) { this.value = 0; } }
 * 
 * public int getValue() { return this.value; }
 * 
 * public void setValue(int input) { if (input < 0 || input > this.upperLimit) {
 * return; }
 * 
 * this.value = input; }
 * 
 * public String toString() { if (this.value < 10) { return "0" + this.value; }
 * else { return "" + this.value; } } }
 */