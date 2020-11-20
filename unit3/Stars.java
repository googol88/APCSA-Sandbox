class Stars {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      int j = 0;
      if (i % 2 == 1) {
        j++;
        System.out.print(" ");
      }
      for (j*=1; j < 6; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}