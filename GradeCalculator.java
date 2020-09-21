import java.util.Scanner;

class GradeCalculator{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

    System.out.print("Enter grade 1/5: ");
    int grade1 = scan.nextInt();

    System.out.print("Enter grade 2/5: ");
    int grade2 = scan.nextInt();

    System.out.print("Enter grade 3/5: ");
    int grade3 = scan.nextInt();

    System.out.print("Enter grade 4/5: ");
    int grade4 = scan.nextInt();

    System.out.print("Enter grade 5/5: ");
    int grade5 = scan.nextInt();

    double average = ((double)grade1+grade2+grade3+grade4+grade5)/5;
    System.out.println("Average: "+average);
	
  }
}