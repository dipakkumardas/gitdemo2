package InterviewQuesting;

public class SwapNo {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 5;
		/*int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);*/
		
		a=a+b; // 9 a current Value 
		b=a-b; // 9 -5 = 4
		a=a-b; // 5
		System.out.println(b);
		System.out.println(a);
		
		
		

	}

}
