package HashMapBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//9 - How to compare two Youtube Collection Video
public class HashMapCompare {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(3, "C");
		map2.put(2, "B");
		map2.put(1, "A");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		map3.put(1, "C");
		map3.put(2, "A");
		map3.put(3, "B");
		map3.put(3, "D");
		
		//1.Compare the Value on the Basic of Key and Value pair format
		System.out.println(map1.equals(map2)); //True
		System.out.println(map1.equals(map3)); //False
		
		//2. Compare hashmap for the same Key set
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet())); // It's Ignore the duplicate Value
		
		//3. Find the Extra Keys
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1,"A");
		map4.put(2,"B");
		map4.put(3,"C");
		map4.put(4,"D");
		
		// Combine the keys from both the map : using hash set
		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
		// Add Keyset from map4 
		combineKeys.addAll(map4.keySet());
		System.out.println(combineKeys);
		combineKeys.removeAll(map1.keySet());
		System.out.println("Extra Key is  :" +combineKeys);
		
		//4 .Compare Map By Values 
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1,"A");
		map5.put(2,"B");
		map5.put(3,"C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(4,"A");
		map6.put(5,"B");
		map6.put(6,"C");
		
		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1,"A");
		map7.put(2,"B");
		map7.put(3,"C");
		map7.put(4,"C");
		
		//1. Duplicate Value not allowed: Using Array List 
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
		//2. Duplicate value allows : Using Hashset
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); // true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
		
		
		

	}

}
