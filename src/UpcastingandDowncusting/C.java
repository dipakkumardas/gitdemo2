package UpcastingandDowncusting;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a object of the child class passing the Ref of the parent class it's called UpCasting
		A o = new B();
		//When We use upcast it's only shows commonly use method.
		o.sum(12, 12);
		o.sub(20, 10);
		
		
		
		// I  am Type Casting upcusted object back to the child class object is called downcasting
		
		B o1 = (B) o;
		o1.multi(20, 10);
		// WebDriver driver = new ChromeDriver(); // Object of the Child Class - ChromeDriver() - Passing the ref of the Parent 
		
		
		

	}

}
