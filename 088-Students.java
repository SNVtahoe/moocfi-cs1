import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<Student>();
    Scanner reader = new Scanner(System.in);

    while (true) {
      System.out.print("name: ");
      String name = reader.nextLine();

      if (name.isEmpty()) {
        break;
      }

      System.out.print("studentnumber: ");
      String number = reader.nextLine();

      Student newStudent = new Student(name, number);
      list.add(newStudent);
    }

    for (Student ind : list) {
      System.out.println(ind.toString());
    }

    System.out.print("Give search term: ");
    String search = reader.nextLine();

    System.out.println("Result:");
    for (Student ind : list) {
      if (ind.getName().contains(search)) {
        System.out.println(ind.toString());
      }
    }

    reader.close();
  }
}

/*
 * public class Student { private String name; private String studentNumber;
 * 
 * public Student(String name, String studentNumber) { this.name = name;
 * this.studentNumber = studentNumber; }
 * 
 * public String getName() { return this.name; }
 * 
 * public String getStudentNumber() { return this.studentNumber; }
 * 
 * public String toString() { return this.name + " " + "(" + this.studentNumber
 * + ")"; } }
 */