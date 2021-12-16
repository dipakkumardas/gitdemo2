package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("Dipak");
		ar1.add("Kumar");
		ar1.add("Das");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Java");
		ar2.add("Python");
		ar2.add("SQL");
		
		//ar1.addAll(ar2);
		ar1.addAll(2, ar2);
		System.out.println(ar1);
		@SuppressWarnings("unchecked")
		ArrayList <String> clonelist = (ArrayList<String>)ar1.clone();
		System.out.println(clonelist);
		System.out.println(ar1.contains("Dipak"));
		System.out.println(ar1.contains("C"));
		System.out.println(ar1.indexOf("Python")>2);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Harry","David"));
		System.out.println(list1);
		
		list1.remove(2);
		System.out.println(list1);
		
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		// Using lamda Expression if Number is divide by 2 the removed all
		number.removeIf(num ->num%2!=0);
		//number.removeIf(num ->num%2==0);
		
		System.out.println(number);
		
		
		ArrayList<String> namelist = new ArrayList<String>(Arrays.asList("Naveen","Tom","Harry","David","Tom"));
		
		namelist.retainAll(Collections.singleton("Tom"));
		
		System.out.println(namelist); // It's retain Only tom
		
		// Print the Sub List
		
		ArrayList<Integer> number2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
		System.out.println(number2);
		
		ArrayList<Integer> sublist = new ArrayList<Integer>(number2.subList(2, 8));
		System.out.println(sublist);
		
		ArrayList<String> namelist2 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Harry","David","Tom"));
		
		Object arr[] = namelist2.toArray();
		System.out.println(Arrays.toString(arr));
		for(Object o :arr)
		{
			System.out.println((String)o);
		}
		
		
		
	}

}
