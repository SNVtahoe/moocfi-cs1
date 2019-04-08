import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    LotteryNumbers lotteryNumbers = new LotteryNumbers();
    ArrayList<Integer> numbers = lotteryNumbers.numbers();

    System.out.println("Lottery Numbers:");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println("");
  }
}

/*
 * import java.util.ArrayList; import java.util.Random;
 * 
 * public class LotteryNumbers { private ArrayList<Integer> numbers; private
 * Random ranMethod;
 * 
 * public LotteryNumbers() { this.numbers = new ArrayList<Integer>();
 * this.ranMethod = new Random(); this.drawNumbers(); }
 * 
 * public ArrayList<Integer> numbers() { return this.numbers; }
 * 
 * public void drawNumbers() { this.numbers.clear();
 * 
 * while (true) { int lotto = this.ranMethod.nextInt(39) + 1;
 * 
 * if (!containsNumber(lotto)) { this.numbers.add(lotto); }
 * 
 * if (this.numbers.size() == 7) { break; } } }
 * 
 * public boolean containsNumber(int number) { return
 * this.numbers.contains(number); } }
 */