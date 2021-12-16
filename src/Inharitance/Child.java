package Inharitance;

public class Child extends Parent {
	
	int j = 20;
	
	public void milti(int a, int b)
	{
		System.out.println(a*b);
		System.out.println("This Child Class "+ this.j);
		System.out.println("This is Parent Class"+ super.j);
	}

}
