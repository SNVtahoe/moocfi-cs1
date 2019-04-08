public class Main {

  public static void main(String[] args) {
    HangmanLogic logic = new HangmanLogic("parameter");
    HangmanUserInterface game = new HangmanUserInterface(logic);
    game.start();
  }
}

public class HangmanLogic {

  private String word;
  private String guessedLetters;
  private int numberOfFaults;

  public HangmanLogic(String word) {
    this.word = word.toUpperCase();
    this.guessedLetters = "";
    this.numberOfFaults = 0;
  }

  public int numberOfFaults() {
    return this.numberOfFaults;
  }

  public String guessedLetters() {
    return this.guessedLetters;
  }

  public int losingFaultAmount() {
    return 12;
  }

  public void guessLetter(String letter) {
    // program here the functionality for making a guess

    // if the letter has already been guessed, nothing happens
    if (this.guessedLetters.contains(letter)) {
      return;
    }

    // it the word does not contains the guessed letter, number of faults increase
    // the letter is added among the already guessed letters
    this.guessedLetters += letter;

    if (!this.word.contains(letter)) {
      this.numberOfFaults++;
    }
  }

  public String hiddenWord() {
    // program here the functionality for building the hidden word

    // create the hidden word by interating through this.word letter by letter
    // if the letter in turn is within the guessed words, put it in to the hidden
    // word
    // if the letter is not among guessed, replace it with _ in the hidden word
    String hiddenWord = "";
    int iterator = this.word.length();

    for (int counter = 0; counter < iterator; counter++) {
      String current = "" + this.word.charAt(counter);

      if (this.guessedLetters.contains(current)) {
        hiddenWord += current;
      } else {
        hiddenWord += "_";
      }
    }

    // return the hidden word at the end
    return hiddenWord;
  }
}
