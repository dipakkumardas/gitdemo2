package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();

		studentList.add("Dipak");
		studentList.add("Ramesh");
		studentList.add("Naveen");
		studentList.add("Jems");

		// For Loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("The name of the Student is:" + studentList.get(i));
		}

		// For Each Loop
		for (String s : studentList) {
			System.out.println(s);
		}

		// For Each Lamda Expression
		System.out.println("****** Stream Lamda Expression***********");
		studentList.stream().forEach(ele -> System.out.println(ele));

		// Iterator
		System.out.println("*********Iterator*****************");
		Iterator<String> it = studentList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Creating array List with another Array List
		
		System.out.println("***** Array List With Another Array List Integer*********");
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		System.out.println("***** Array List With Another Array List String *********");
		ArrayList<String> StudentName = new ArrayList<String>(Arrays.asList("Java","Phthon"));
		System.out.println(StudentName);
		System.out.println(StudentName.size());
		
		
		


	}

}
