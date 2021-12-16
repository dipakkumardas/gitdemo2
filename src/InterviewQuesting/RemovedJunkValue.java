package InterviewQuesting;

public class RemovedJunkValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "!@#$%^&*()  Lating Sting 12345";
		
		String s1 = "!@#$%^&*()_+ --*-*-- Java";
		
		// Regular Expression = [a-zA-Z0-9]
		s =	s.replaceAll("[^a-zA-Z0-9]", "");
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
	  
	  System.out.println(s);
	  System.out.println(s1);

	}

}
