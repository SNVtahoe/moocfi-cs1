import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Database db = new Database();

    while (true) {
      System.out.print("? ");

      String command = scanner.nextLine();

      if (command.equals("Quit")) {
        break;
      } else if (command.equals("Add")) {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();

        db.addBird(new Bird(name, latinName));
      } else if (command.equals("Observation")) {
        System.out.print("What was observed: ");
        String name = scanner.nextLine();

        db.obsBird(name);
      } else if (command.equals("Statistics")) {
        db.stats();
      } else if (command.equals("Show")) {
        System.out.print("What? ");
        String name = scanner.nextLine();

        db.show(name);
      }
    }
  }
}

/*
 * import java.util.ArrayList;
 * 
 * public class Database { public ArrayList<Bird> birds;
 * 
 * public Database() { this.birds = new ArrayList<Bird>(); }
 * 
 * public void addBird(Bird newBird) { this.birds.add(newBird); }
 * 
 * public void obsBird(String name) { Boolean trigger = false;
 * 
 * for (Bird bird : birds) { if (bird.birdName().equals(name)) { bird.obs();
 * trigger = true; } }
 * 
 * if (!trigger) { System.out.println("Is not a bird!"); } }
 * 
 * public void stats() { for (Bird bird : birds) { System.out.println(bird); } }
 * 
 * public void show(String name) { for (Bird bird : birds) { if
 * (bird.birdName().equals(name)) { System.out.println(bird); } } } }
 */

/*
 * public class Bird { private String name; private String latinName; private
 * int timesSeen;
 * 
 * public Bird(String name, String latinName) { this.name = name; this.latinName
 * = latinName; this.timesSeen = 0; }
 * 
 * public void obs() { this.timesSeen++; }
 * 
 * public String birdName() { return this.name; }
 * 
 * public String latinName() { return this.latinName; }
 * 
 * public int obsNumber() { return this.timesSeen; }
 * 
 * public String toString() { return this.name + "(" + this.latinName + "): " +
 * this.timesSeen + " observations."; } }
 */