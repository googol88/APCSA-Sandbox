class WhileLoopMethod {
  public static void printUntilTarget(int min, int max, int target) {
    if (target >= min && target <= max) {
      int randomInt;(int)
      while (target != ((Math.random()*(max-min+1)) + min)) {
        System.out.println(randomInt);
      }
    }
  }
  public static void main(String[] args) {
    printUntilTarget(0, 100, 50);
  }
}