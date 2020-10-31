class LeapYear {
  public static void main(String[] args) {
    int[] years = {
      1900,
      2000,
      2004,
      2019,
      2020
    };
    for (int year : years) {
      boolean isLeapYear = (year%4 == 0) && !(year%100 == 0 && year%400 != 0);
      System.out.println(year+" -> "+isLeapYear);
    }
  }
}