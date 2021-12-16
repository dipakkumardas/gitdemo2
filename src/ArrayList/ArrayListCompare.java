package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		//1 . Compare Between Two Array List
		
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
		
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> c = new ArrayList<String>(Arrays.asList("B","A","C","D","E","F"));
		
		
		
		Collections.sort(a);
		Collections.sort(b);
		Collections.sort(c);
		
		System.out.println(a.equals(b));
		
		System.out.println(a.equals(c));
		
		//2. Compare Between Two Array List
		
		ArrayList<String> d = new ArrayList<String>(Arrays.asList("A","B","C","D","E","G"));
		
		ArrayList<String> e = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
		
		//d.removeAll(e);
		//System.out.println(d);
		
		//Find the Missing Element of e
		
		e.removeAll(d);
		System.out.println(e);
		
		//Find out the Common Element
		
		ArrayList<String> language = new ArrayList<String>(Arrays.asList("Java","Python","C#","PHP","Ruby"));
		
		ArrayList<String> language2 = new ArrayList<String>(Arrays.asList("Java","Python","C#","PHP"));
		
		language.retainAll(language2);
		
		System.out.println(language);
		
	
		

	}

}
