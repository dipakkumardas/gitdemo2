package Rough;

public class FabNacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 ,1 ,1 , 2, 3,5,8,13..
		
		int a = 0;
		int b=1;
		int i=1;
		int sum=0;
		
		for(i=0;i<15;i++)
		{
			sum=a+b; //1
			System.out.println(sum);
			a=b; // 0
			b=sum; //1
			
			
		}

	}

}
