public class Main {
  public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();
    phonebook.add("Pekka Mikkola", "040-123123");
    phonebook.add("Edsger Dijkstra", "045-456123");
    phonebook.add("Donald Knuth", "050-222333");

    String number = phonebook.searchNumber("Pekka Mikkola");
    System.out.println(number);

    number = phonebook.searchNumber("Martti Tienari");
    System.out.println(number);
  }
}

/*
 * public class Person { private String name; private String number;
 * 
 * public Person(String name, String number) { this.name = name; this.number =
 * number; }
 * 
 * public String toString() { return this.name + " number: " + this.number; }
 * 
 * public String getName() { return this.name; }
 * 
 * public String getNumber() { return this.number; }
 * 
 * public void changeNumber(String newNumber) { this.number = newNumber; } }
 */

/*
 * import java.util.ArrayList;
 * 
 * public class Phonebook { private ArrayList<Person> people;
 * 
 * public Phonebook() { this.people = new ArrayList<Person>(); }
 * 
 * public void add(String name, String number) { this.people.add(new
 * Person(name, number)); }
 * 
 * public void printAll() { for (Person person : people) {
 * System.out.println(person); } }
 * 
 * public String searchNumber(String name) { for (Person person : people) { if
 * (person.getName().equals(name)) { return person.getNumber(); } }
 * 
 * return "number not known"; } }
 */