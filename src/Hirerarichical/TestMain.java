package Hirerarichical;

public class TestMain {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.bClassMethod();
		obj.aClassMethod();
		
		C obj2 = new C();
		obj2.cClassMethod();
		obj2.aClassMethod();

	}

}
