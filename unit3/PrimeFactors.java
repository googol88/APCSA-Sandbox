import java.util.ArrayList;

class PrimeFactors {
  // precondition: n is a positive integer greater than1
  public static ArrayList<Integer> getPrimeFactors(int n) {
    // create empty list to hold prime factors
    ArrayList<Integer> factors = new ArrayList<Integer>();
    int factor;

    for (int i = 2; i <= Math.sqrt(n); i++) { // is n prime?
      if (n % i == 0) { // no
        // Find the smallest factor of your number and add it to your list of primes
        factors.add(i);
        // Divide your number by the smallest factor and store it in a variable called factor
        factor = n/i;

        for (int j = 2; j <= Math.sqrt(factor); i++) { // is factor prime?
          if (n % j == 0) { // no
            // Find the smallest factor of your number and add it to your list of primes
            factors.add(j);
            // Divide your number by the smallest factor and store it in a variable called factor
            factor = factor/j;
          }
        }
        // break;
      }
    }

    // yes
    factors.add(n);
    // Return your list of primes
    return factors;
  }

  public static void main(String[] args) {
    System.out.println(getPrimeFactors(21));
  }
}