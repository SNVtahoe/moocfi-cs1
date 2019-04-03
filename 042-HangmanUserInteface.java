import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        // The reason this file has 4 spaces for indentations in comparison to the other
        // week two files is because I downloaded the zip from mooc.fi's server.
        // It is their own styling.
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        while (hangman.gameOn()) {
            System.out.println("Type a command:");
            String command = reader.nextLine();

            if (command.equals("status")) {
                hangman.printStatus();
            } else if (command.length() == 1) {
                hangman.guess(command);
            } else if (command.isEmpty()) {
                printMenu();
            } else if (command.equals("quit")) {
                break;
            }

            hangman.printMan();
            hangman.printWord();
        }

        System.out.println("Thank you for playing!");

        reader.close();
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
