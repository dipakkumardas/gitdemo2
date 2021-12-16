package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//1 : Collections.SynchronizedArrayList
		List<String> namelist = Collections.synchronizedList(new ArrayList<String>());
		
		namelist.add("Dipak");
		namelist.add("Java");
		namelist.add("Python");
		// add , Removed we donot need explicit synchronization 
		// To Fatch the value we need explicit synchronization
		
		
		synchronized (namelist) {
			Iterator<String> it = namelist.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
		
		//2. copyOnWriteArrayList -- it's a Class :Thread Safe Synchronized already.
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Jerry");
		empList.add("Miller");
		
		// We Donot need any explicit Synchronization for any operation :add/removed/traverse
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
