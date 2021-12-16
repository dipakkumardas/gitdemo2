package ArrayList;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		// Defalt Capacity is 10
		
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add(100);
		System.out.println(ar.size());
		ar.add(200);
		ar.add(500);
		System.out.println(ar.size());
		

	}

}
