import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  
    String[] row1 = {"Ryan P"};
    String[] row2 = {"Crosby", "Ben"};
    String[] row3 = {"Charlie"};
    String[] row4 = {"Nora", "CJ"};
    String[] row5 = {};
    String[] wishYouWereHere = {"Ryan B", "Jon", "Dan", "Tyler", "EMILY"};

    String[][] students = {{"Ryan P"}, row2, row3, row4, row5, wishYouWereHere, args};

    /* 1) traverse the students array using nested traditional for loops. Print each student's name
    on a separate line */
    for(int i = 0; i < students.length; i++) {
      for(int j = 0; j < students[i].length; j++) {
        System.out.println(students[i][j]);
      }
    }

    /* 2) traverse the students array using nested for-each loops. Print each student's name
    on a separate line */
    for(String[] row : students) {
      for(String student : row) {
        System.out.println(student);
      }
    }


  }
}