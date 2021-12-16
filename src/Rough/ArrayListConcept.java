package Rough;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList <Object> ar = new ArrayList<Object>();
		
		ar.add(100);
		ar.add(200);
		ar.add("Dipak");
		
		System.out.println(ar.size());
		
		ar.add(12.50);
		ar.add(true);
		ar.add("Array List");
		System.out.println(ar.size());
		
		
		
		System.out.println(ar);
		
		// Print The Value by Using For Loop
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		
		}
		
		
		
		
		
	}

}
