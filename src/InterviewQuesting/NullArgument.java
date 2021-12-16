package InterviewQuesting;

public class NullArgument {
	
	// Pass the null argument with method overloading with string and Object type

	public static void main(String[] args) {
		
		test(null);
		
	}
		
		public static void test(Object o)
		{
			System.out.println("Object Argument");
		}
		
		public static void test(String s)
		{
			System.out.println("String Argument");

	}

}
