package Rough;

public class RevNo {

	public static void main(String[] args) {
		
		int no = 5432;
		int rev = 0;
		int reminder=0;
		
		while(no !=0)
		{
		  reminder=no%10;
		  rev = rev*10+reminder;
		  no = no/10;
		}
		
		System.out.println(rev);

	}

}
