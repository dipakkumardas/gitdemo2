package HashMapBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasic {

	public static void main(String[] args) {
		
		HashMap<String , String> Studentlist = new HashMap<String,String>();
		Studentlist.put("Sec 1","Dipak");
		Studentlist.put("Sec 2","Tom");
		Studentlist.put("Sec 3","Harry");
		Studentlist.put("Sec 4","Joe");
		Studentlist.put("Sec 4","Joe1");
		
		System.out.println(Studentlist.get("Sec 4"));
		
		// How to traverse the Value By using Key Set
		Iterator<String> it = Studentlist.keySet().iterator();
		while(it.hasNext()) {
		String key = it.next();
		String value = Studentlist.get(key);
		System.out.println("Key = "+key + " value= "+value);
		}
		
		System.out.println("*********************************");
		
		Iterator<Entry<String,String>> it1 = Studentlist.entrySet().iterator();
		
		while(it1.hasNext())
		{
			Entry<String,String> entry = it1.next();
			System.out.println("key ="+entry.getKey()+"and value ="+entry.getValue());
		}
		
		// Iterate using Lamda Expression
		System.out.println("*******************Using Lamda Expression **************");
		Studentlist.forEach((Key, Value) -> System.out.println("Key is ="+Key + "and value =" + Value));
		
		

	}

}
