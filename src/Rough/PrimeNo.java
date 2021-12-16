package Rough;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;
		int temp = 0;
		
		for(int i =2 ; i<=a-1;i++)
		{
			if(a%i==0)
			{
				temp = temp+1;
			}
			
		}
		
		if(temp>0)
		{
			System.out.println("Not Prime No");
		}
		
		else
		{
			System.out.println("The Number is Prime");
		}
		

	}

}
