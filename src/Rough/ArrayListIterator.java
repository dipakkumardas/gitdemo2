package Rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("Dipak Das");
		s.add("Naveen Kumar");
		
		// For Loop
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
		
		// For each Loop
		System.out.println("****For each Loop*******");
		for(String a : s)
		{
			System.out.println(a);
		}
		System.out.println("*****Lamda Expression");
		s.stream().forEach(ele ->System.out.println(ele));
		
		System.out.println("*******Iterator*********");
		
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("*******Array List*********");
		
		ArrayList <Integer> a = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(a);
		
		ArrayList <String> name = new ArrayList<String>(Arrays.asList("Dipak","Naveen","Kumar"));
		System.out.println(name);
		
		
		

	}

}
