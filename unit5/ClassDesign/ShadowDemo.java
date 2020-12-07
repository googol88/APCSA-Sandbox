public class ShadowDemo{
	private String firstName;
	private String lastName;
	public ShadowDemo(String first, String last){
		String firstName = first;
		lastName = last;
	}

	public static void main(String[] pizza){
		ShadowDemo demo = new ShadowDemo("Keith", "Richards"); //1
		String first = demo.firstName; //2
		System.out.println(first.length()); //3
	}
}
