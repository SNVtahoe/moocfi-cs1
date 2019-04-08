public class Program {
  public static void main(String[] args) {
    PasswordRandomizer randomizer = new PasswordRandomizer(13);
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
  }
}

/*
 * import java.util.Random;
 * 
 * public class PasswordRandomizer { private int length; private Random random;
 * 
 * public PasswordRandomizer(int length) { this.length = length; this.random =
 * new Random(); }
 * 
 * public String createPassword() { String genPw = ""; int counter = 0;
 * 
 * while (counter < this.length) { int alphaIndex = this.random.nextInt(26) + 1;
 * genPw += "abcdefghijklmnopqrstuvwxyz".charAt(alphaIndex - 1); counter++; }
 * 
 * return genPw; } }
 */