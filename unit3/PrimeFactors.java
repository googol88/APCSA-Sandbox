import java.util.ArrayList;

class PrimeFactors {
  // precondition: n is a positive integer greater than1
  public static ArrayList<Integer> getPrimeFactors(int n) {
    // create empty list to hold prime factors
    ArrayList<Integer> factors = new ArrayList<Integer>();

    for (int i = 2; i <= Math.sqrt(n); i++) { // is n prime?
      // no
      if (n % i == 0) {
        factors.add(i); // add smallest factor to list of primes
        n = n/i; // divide by smallest factor and store in n
        i--; // subtract by one to account for potential repeating factors
      }
    }
    // yes
    factors.add(n);
    // Return your list of primes
    return factors;
  }

  public static void main(String[] args) {
    // 3 primes, 3 composities, edge cases
    int[] testCases = {163, 19, 71, 42, 9, 172, 266, 2, 4};
    for (int num : testCases) {
      System.out.println(getPrimeFactors(num));
    }
  }
}