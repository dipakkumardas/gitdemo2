package Rough;

public class SwapNo {

	public static void main(String[] args) {
	
		int a = 4;
		int b =5;
		
		System.out.println("Initial Value a :"+a +"and b:"+b);
		a = a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap a :" +a+"and b:"+b);
		
		

	}

}
