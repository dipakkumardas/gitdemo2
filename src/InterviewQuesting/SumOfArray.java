package InterviewQuesting;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int sum = sumofArray(a);
		
		System.out.println(sum);
		

	}

	public  static int sumofArray(int[] a ) {
		
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum = sum +a[i];
		}
		return sum;
		
		
	}

}
