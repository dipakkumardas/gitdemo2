package Rough;

public class reverseText {

	public static void main(String[] args) {
		
		String s ="Dipak";
		String t ="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		
		System.out.println(t);
		
		if(t.contentEquals(s))
		{
			System.out.println("This Name is PalinDrome :"+t);
		}
		else
		{
			System.out.println("The String is not PalinDrome");
		}
		
	}
		
}
