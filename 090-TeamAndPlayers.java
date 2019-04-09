public class Main {
  public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");

    Player brian = new Player("Brian");
    Player pekka = new Player("Pekka", 39);
    barcelona.addPlayer(brian);
    barcelona.addPlayer(pekka);
    barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

    System.out.println("Total goals: " + barcelona.goals());
  }
}

/*
 * import java.util.ArrayList;
 * 
 * public class Team { private String name; private ArrayList<Player> players;
 * private int maxSize;
 * 
 * public Team(String name) { this.name = name; this.players = new
 * ArrayList<Player>(); this.maxSize = 16; }
 * 
 * public String getName() { return this.name; }
 * 
 * public void addPlayer(Player player) { if (this.players.size() ==
 * this.maxSize) { return; }
 * 
 * this.players.add(player); }
 * 
 * public void printPlayers() { for (Player player : players) {
 * System.out.println(player); } }
 * 
 * public void setMaxSize(int maxSize) { this.maxSize = maxSize; }
 * 
 * public int size() { return this.players.size(); }
 * 
 * public int goals() { int totalGoals = 0;
 * 
 * for (Player player : players) { totalGoals += player.goals(); }
 * 
 * return totalGoals; } }
 */

/*
 * public class Player { private String name; private int goals;
 * 
 * public Player(String name, int goals) { this.name = name; this.goals = goals;
 * }
 * 
 * public Player(String name) { this(name, 0); }
 * 
 * public String getName() { return this.name; }
 * 
 * public int goals() { return this.goals; }
 * 
 * public String toString() { return this.name + "," + " goals " + this.goals; }
 * }
 */