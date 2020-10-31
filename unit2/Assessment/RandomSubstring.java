class RandomSubstring {
  public static String randomSubstring(String s) {
    int from = (int)(Math.random()*s.length());
    int to = (int)(Math.random()*(s.length()-from))+from+1;
    return s.substring(from, to);
  }
  public static void main(String[] args) {
    for (int i=0; i<20; i++) {
      System.out.println(randomSubstring("pizza"));
    }
  }
}