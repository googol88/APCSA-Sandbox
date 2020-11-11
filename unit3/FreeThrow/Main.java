class Main {
  public static void main(String[] args) {
    int totalShots = 0;
    int currentStreak = 0;
    int longestStreak = 0;

    while(currentStreak <= 97){
      if (Math.random() <= 0.9) { 
        System.out.print("HIT ");
        currentStreak++;
        if (currentStreak > longestStreak)
          longestStreak = currentStreak;
      } else {
        System.out.print("MISS");
        currentStreak = 0;
      }
      System.out.println("  Total Shots: " + totalShots + "  Current Streak: " + currentStreak + "  Longest Streak: " + longestStreak);
      
      try{
        Thread.sleep(100);
      }
      catch(Exception ex){
        System.out.println(ex.getMessage());
      }
      totalShots++;
    }
    System.out.println("All Time Record Broken after " + totalShots + " total shots taken");
  }
}