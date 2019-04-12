public class Main {
  public static void main(String[] args) {
    NightSky NightSky = new NightSky(8, 4);
    NightSky.print();
    System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    System.out.println("");

    NightSky.print();
    System.out.println("Number of stars: " + NightSky.starsInLastPrint());
  }
}

/*
 * import java.util.Random;
 * 
 * public class NightSky { private double density; private int width; private
 * int height; private int starsInLastPrint;
 * 
 * public NightSky(double density, int width, int height) { this.density =
 * density; this.width = width; this.height = height; }
 * 
 * public NightSky(int width, int height) { this(0.1, width, height); }
 * 
 * public NightSky(double density) { this(density, 20, 10); }
 * 
 * public void printLine() { Random random = new Random();
 * 
 * for (int row = 0; row < this.width; row++) { if (random.nextDouble() <
 * this.density) { System.out.print("*"); this.starsInLastPrint++; } else {
 * System.out.print(" "); } }
 * 
 * System.out.println(""); }
 * 
 * public void print() { this.starsInLastPrint = 0;
 * 
 * for (int row = 0; row < this.height; row++) { this.printLine(); } }
 * 
 * public int starsInLastPrint() { return this.starsInLastPrint; } }
 */