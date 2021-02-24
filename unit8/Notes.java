import java.util.Arrays;
class Notes {
  public static void main(String[] args) {
    String[] row1 = {"Ryan P"};
    String[] row2 = {"Crosby", "Ben"};
    String[] row3 = {"Charlie"};
    String[] row4 = {"Nora", "CJ"};
    String[] row5 = {};
    String[] wishYouWereHere = {"Ryan B", "Jon", "Dan", "Tyler", "EMILY"};

    String[][] students = {row1, row2, row3, row4, row5, wishYouWereHere, args};

    System.out.println(Arrays.deepToString(students));
    System.out.println(Arrays.toString(students)); // returns each sub-array as a reference
    System.out.println(Arrays.toString(students[3]));
    System.out.println(students[3][2]); // DON'T use toString since it's just a String!
  }
}