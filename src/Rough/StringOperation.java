package Rough;

public class StringOperation {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Dipak");
		System.out.println(sb.reverse());
		
		StringBuilder ssb = new StringBuilder("Selenium");
			System.out.println(ssb.reverse());
			
			String a = "Dipak";
			String rev="";

			for(int i=a.length()-1;i>=0;i--)
			{
				rev= rev  +a.charAt(i);
				
			}
			
			System.out.println(rev);
			
	}

}
