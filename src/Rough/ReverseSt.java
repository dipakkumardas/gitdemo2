package Rough;

public class ReverseSt {

	public static void main(String[] args) {
		
		String a = "madam";
		String t="";
		
			
		
		for(int i = a.length()-1;i>=0;i--)
		{
			t=t+a.charAt(i);
		}
		
		System.out.println(t);
		

	}

}
