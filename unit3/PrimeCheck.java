class PrimeCheck {
  // precondition: n is a positive integer greater than1
  public static boolean isPrime(int n) {
    // loop through all numbers from 2 up to sqrt of number
      // check if divides evenly
      // if true
        // not prime
    // it's prime
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    for (int i = 1; i < 100; i++) {
      System.out.println(i+": "+isPrime(i));
    }
  }
}