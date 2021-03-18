class Main {
  /* Output: 3.141590653589692
   *                ^
   * Decimals of Precision: 5 */
  public static void main(String[] args) {
    
    double pi = 0.0;

    for(int i = 1; i < 1_000_000; i+=2) {
      if(i % 4 == 1)
        pi += 4.0/i;
      else
        pi -= 4.0/i;
      System.out.println(pi);
    }

  }
}