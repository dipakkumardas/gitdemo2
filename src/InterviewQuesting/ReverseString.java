package InterviewQuesting;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";
		int length = s.length();
		String rev="";
		
		for(int i=length-1;i>=0;i--)
		{
			
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer();
		sb.reverse();
		System.out.println(sb);

	}

}
