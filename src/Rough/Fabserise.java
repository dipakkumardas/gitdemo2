package Rough;

public class Fabserise {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum=0;
		int i=1;
		
		for(i=0;i<15;i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
		
		

	}

}
