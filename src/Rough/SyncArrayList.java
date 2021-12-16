package Rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. We Use Collection.synchronizedList - Method we used.
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());

		nameList.add("Java");
		nameList.add("Python");
		nameList.add("C");

		synchronized (nameList) {
			Iterator<String> it = nameList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
						
		}
		
	 //2. CopyonWriteArrayList
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		
		empList.add("Tome");
		empList.add("Jerry");
		empList.add("Joe");
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
