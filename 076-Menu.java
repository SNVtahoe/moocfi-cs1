public class Main {

  public static void main(String[] args) {
    Menu myMenu = new Menu();

    myMenu.addMeal("Hamburger");
    myMenu.addMeal("Fish'n'Chips");
    myMenu.addMeal("Sauerkraut");
    myMenu.addMeal("Hamburger");

    myMenu.printMeals();
    myMenu.clearMenu();
    myMenu.printMeals();
  }
}

/*
 * import java.util.ArrayList;
 * 
 * public class Menu { private ArrayList<String> meals;
 * 
 * public Menu() { this.meals = new ArrayList<String>(); }
 * 
 * public void addMeal(String meal) { if (!meals.contains(meal)) {
 * this.meals.add(meal); } }
 * 
 * public void printMeals() { for (String meal : this.meals) {
 * System.out.println(meal); } }
 * 
 * public void clearMenu() { this.meals.clear(); } }
 */