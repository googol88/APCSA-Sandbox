import java.util.Scanner;
class GroupSizeCalculator{
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args){

    System.out.print("Number of students: ");
    int numStudents = scan.nextInt();

    System.out.print("Group size: ");
    int groupSize = scan.nextInt();

    int numGroups = numStudents / groupSize;
    int remainder = numStudents % groupSize;
    System.out.print("There will be " + numGroups + " groups with " + remainder + " students left-over");
  
  }
}