package com.hpe.day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		
		map.put("Naveen", 35); 
		map.put("Arun", 37); 
		map.put("Peter", 14); 
		
		
		System.out.println(map.get("Naveen"));
		System.out.println(map.get("Arun"));
		map.put("Naveen", 36); 

		System.out.println("--------------------------------------");
		
		// ctrl -  2 + l 
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator(); 

		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer>  temp = iterator.next(); 
			System.out.println(temp.getKey() + " , " + temp.getValue());
		}
	}
}
