package InterviewQuesting;

public class ReverseNo {

	public static void main(String[] args) {
		
		int no = 543,rem=0, rev=0;
		
		while(no !=0)
		{
			rem = no%10; // Rem 2
			rev=rev*10+rem; // 2
			no = no/10;  //5432/10 //543
		}
		
		System.out.println(rev);
	}

}
