import java.util.Scanner;
public class PrimeNumberGame {
  static Scanner scan = new Scanner(System.in);
  public static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    int currentGuess;
    int previousGuess = -1;
    int correctGuesses = 0;
    while (true) {
      System.out.print("Enter prime: ");
      currentGuess = scan.nextInt();
      if (!isPrime(currentGuess) || currentGuess <= previousGuess) {
        break;
      }
      correctGuesses++;
      previousGuess = currentGuess;
    }
    System.out.println("Game over! Number correct: " + correctGuesses);
  }
}