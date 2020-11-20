# Practice Free Response Question - Prime Number Game

Make a game where a user tries to enter as many prime numbers as they can think of. The trick is, each new prime they enter must be larger than the previous prime (You will need variables to track the previous guess and current guess). Keep track of how many correct primes the person has entered. If the user enters a number that is either not prime, or smaller than the previous prime, the game is over. At the end of the game, print out how many correct entries they’ve made. 

| Sample input (one input per iteration)     | Sample Output |
| ------------------------------------------ | ------------- |
| 2, 3, 13, 23, 29, 101, ~~111~~ (not prime) | 6             |
| 2, 3, 7, 29, ~~17~~ (17 < 29)              | 4             |


**Note**: *Assume* you have a working static `isPrime()` method. Do NOT write an `isPrime()` method.
```
public class PrimeNumberGame {
  public static boolean isPrime(int n) {
    // implementation not shown
  }
  public static void main(String[] args) {
    // TODO: Write Code :)
  }
}
```
