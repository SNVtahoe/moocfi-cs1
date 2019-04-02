import nhlstats.NHLStatistics;

public class Main {
  public static void main(String[] args) {
    // Sort based on goals
    NHLStatistics.sortByGoals();
    NHLStatistics.top(10);

    // Sort based on penalties
    NHLStatistics.sortByPenalties();
    NHLStatistics.top(25);

    // Search specific player
    NHLStatistics.searchByPlayer("Sidney Crosby");

    // Search specific team
    NHLStatistics.teamStatistics("PHI");

    // Search specific team with players sorted by points
    NHLStatistics.sortByPoints();
    NHLStatistics.teamStatistics("ANA");
  }
}