public class ThisDemo{
	public static final int A = 0;
	private int b;
	private int c;

	public ThisDemo(int b){
		this.b = b; // 1
	}

	public static void staticMethod(){
		System.out.println("The value of b is " + this.b); // 2
  } 

  public void instanceMethod(){
	  System.out.println("The value of b is " + this.b); // 3
	  System.out.println("The value of A is " + this.A); // 4
	}
}