package Rough;

public class revstring {

	public static void main(String[] args) {
		
		String a ="madam";
		String t ="";
		for(int i=a.length()-1;i>=0;i--)
		{
			t=t+a.charAt(i);
		}
		
		System.out.println(t);
		
		if (t.contentEquals(a))
		{
			System.out.println("The No is Palindrome");
		}
		else
		{
			System.out.println("The No Is not Palindrome");
		}

	}

}
