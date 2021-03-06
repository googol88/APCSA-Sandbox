import java.util.Arrays;
import java.awt.Color;

class Main {
  public static void main(String[] args) {
    // declare array - fixed length and cannot change
    int[] favNumbers = {2, 4, 6, 8}; // {} IS NOT AN ARRAY! special syntax to build an array
    String[] realStudents = new String[3];
    boolean[] bArr = new boolean[4];

    // default values
    System.out.println(Arrays.toString(realStudents)); // [null, null, null, null]
    System.out.println(Arrays.toString(bArr)); // [false, false, false, false]

    // populate array
    realStudents[0] = "Doc";
    realStudents[1] = "McStuffins";
    realStudents[2] = "Charles";
    realStudents[realStudents.length-1] = "The Queen"; // last index of array
    //realStudents[7] = "CJ"; // run-time error | OutOfBoundsException
    
    
    String[] fakeStudents = new String[4];
    fakeStudents[0] = "bob";
    fakeStudents[1] = "alice";
    fakeStudents[3] = "dunkin";
    for (String student : fakeStudents) {
      System.out.println(student);
    }
    for (int i = 0; i < fakeStudents.length; i++) {
      if(fakeStudents[i] != null)
        fakeStudents[i] = fakeStudents[i].toUpperCase();
      System.out.println(fakeStudents[i]);
    }

    // creating aliases
    int[] myFavNumbers = favNumbers;
    myFavNumbers[0] = 1;
    System.out.println(Arrays.toString(myFavNumbers)); // [1, 4, 6, 8]
    System.out.println(Arrays.toString(favNumbers)); // [1, 4, 6, 8]
    // same reference & memory location, so 
    // use clone method - favNumbers.clone()


    // print arguments in main method
    // java Main hello world goodbye -> [hello, world, goodbye]
    System.out.println(Arrays.toString(args));
  }
}