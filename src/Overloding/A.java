package Overloding;

public class A {
	
	
	// This is called overloading - Method Name Same but Signature is different
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(int a, int b, double d)
	{
		System.out.println(a+b+d);
	}
	
	
}
