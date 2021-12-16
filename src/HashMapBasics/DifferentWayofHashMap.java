package HashMapBasics;

import java.util.HashMap;
import java.util.Map;

public class DifferentWayofHashMap {
	
	public static Map<String,Integer> marksMap;
	static
	{
		marksMap = new  HashMap<>(); 
		marksMap.put("A",100);
		marksMap.put("B",200);
	}

	public static void main(String[] args) {
		
		// Tradisatioanl Way
		HashMap<String,String> map1 = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		
		// 2 Static way 
		System.out.println(DifferentWayofHashMap.marksMap.get("A"));

	}

}
