import java.util.Scanner;
class TimesEqualCalculator{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
    String value;
    int total = 1;
    while (true) {
      System.out.print("Enter number to multiply by (enter 'q' to quit): ");
      value = scan.nextLine();
      if (value.equals("q")) {
        System.exit(0);
      }
      total *= Integer.parseInt(value);
      System.out.println(total);
    }
	}
}