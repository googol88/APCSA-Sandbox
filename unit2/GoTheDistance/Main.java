import java.util.Scanner;

class Main {
  private static Scanner scan = new Scanner(System.in);

  /* 
  1) write a static method called `getCoord(String name)` that takes in the name of a coordinate e.g. `x1`. Prompt the user to enter the coordinate with the given name and use `scan.nextInt()` to capture it. Return the value 
  */
  public static int getCoord(String name) {
    System.out.print("Enter "+name+": ");
    int n = scan.nextInt();
    return n;
  }

  /* 
  2) write a static method `calculateDistance(int x1, int y1, int x2, int y2)` that takes in the coordinates and returns the distance between those points as a double.
  */
  public static double calculateDistance(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
  }

  /*
  3) write a static method `pair(int x, int y)` that takes in two integers and returns a String representation of the ordered pair. For example `pair(1, 2)` should return the String "(1, 2)"
  */
  public static String pair(int x, int y) {
    return "("+x+", "+y+")";
  }

  /*
  4) refactor your main method to call these methods wherever possible to simplify your code
  */

  public static void main(String[] args) {
    int x1 = getCoord("x1");
    int y1 = getCoord("y1");
    int x2 = getCoord("x2");
    int y2 = getCoord("y2");

    double distance = calculateDistance(x1, y1, x2, y2);

    System.out.println("Distance between " + pair(x1, y1) + " and " + pair(x2, y2) + " = " + distance);
  }
}