public class Main {
  public static void main(String[] args) {
    DecreasingCounter counter = new DecreasingCounter(2);

    // value: 2
    counter.printValue();

    // value: 1
    counter.decrease();
    counter.printValue();

    // value: 0
    counter.decrease();
    counter.printValue();

    // Exercise 75.2 - remains positive
    counter.decrease();
    // value: 0
    counter.printValue();

    // Exercise 75.3 - reset to 0
    counter.reset();
    // value: 0
    counter.printValue();

    // Exercise 75.4 - set to initial
    counter.setInitial();
    // value: 2
    counter.printValue();
  }
}

/*
 * public class DecreasingCounter { private int value; private int init;
 * 
 * public DecreasingCounter(int valueAtStart) { this.value = valueAtStart;
 * this.init = valueAtStart; }
 * 
 * public void printValue() { System.out.println("value: " + this.value); }
 * 
 * public void decrease() { if (this.value > 0) { this.value--; } }
 * 
 * public void reset() { this.value = 0; }
 * 
 * public void setInitial() { this.value = this.init; } }
 */