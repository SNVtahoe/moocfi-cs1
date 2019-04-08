public class Main {
  public static void main(String[] args) {
    // For testing if you need it
  }
}

/*
 * public class Counter { private int value; private boolean check;
 * 
 * public Counter(int value, boolean check) { this.value = value; this.check =
 * check; }
 * 
 * public Counter(int value) { this(value, false); }
 * 
 * public Counter(boolean check) { this(0, check); }
 * 
 * public Counter() { this(0, false); }
 * 
 * public int value() { return this.value; }
 * 
 * public void increase() { this.value++; }
 * 
 * public void decrease() { if (this.check) {
 * 
 * if (this.value == 0) { return; } else { this.value--; }
 * 
 * } else { this.value--; } }
 * 
 * public void increase(int increaseAmount) { if (increaseAmount >= 0) {
 * this.value += increaseAmount; } }
 * 
 * public void decrease(int decreaseAmount) { if (decreaseAmount >= 0) {
 * 
 * this.value -= decreaseAmount;
 * 
 * if (this.check) {
 * 
 * if (this.value < 0) { this.value = 0; }
 * 
 * }
 * 
 * } } }
 */