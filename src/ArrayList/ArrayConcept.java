package ArrayList;
import java.util.ArrayList;

public class ArrayConcept {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100); //0
		ar.add(200);//1
		ar.add("Testing");//2
		ar.add(true);//3 
		ar.add(12.33);//4
		
		System.out.println(ar);
		
		System.out.println(ar.get(4));
		
		System.out.println(ar.size());
		        
		ar.add(500);
		ar.add("Array List Concept");
		
		System.out.println(ar.size());

	}

}
