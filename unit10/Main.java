class Main {
  /* 
   * squares numbers, using recursion (in an unnecessarily difficult fashion)
   * precondition: n must be positive
   */
  public static int square(int n) {
    if(n <= 1)
      return 1;
    return 2*n + square(n-1) - 1;
  }
  public static int factorial(int n) {
    if(n <= 1)
      return 1;
    return n * factorial(n-1);
  }
  // logic error
  public static int fibonacci(int n) {
    if(n <= 1)
      return n;
    return factorial(n-1) + factorial(n-2);
  }
  public static void main(String[] args) {
    for(int i = 1; i < 10; i++) {
      System.out.print(square(i) + " ");
    }
    System.out.println();
    for(int i = 1; i < 10; i++) {
      System.out.print(factorial(i) + " ");
    }
    System.out.println();
    for(int i = 0; i < 9; i++) {
      System.out.print(fibonacci(i) + " ");
    }
    System.out.println();
  }
}