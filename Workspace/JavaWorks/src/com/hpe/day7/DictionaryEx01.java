package com.hpe.day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// naveen@probits.in 


public class DictionaryEx01 {
	public static void main(String[] args) {
		Map<String, List<String>> dictionary = new HashMap<String, List<String>>(); 
		
		
		dictionary.put("goodmorning", 
			Arrays.asList("Good Morning", "Shubhodaya", "Bonjour", "Buna")); 

		dictionary.put("goodevening", 
				Arrays.asList("Good Evening", "Shubha Sanje", "Bonsoir", "buna seara")); 
		
		Iterator<Entry<String, List<String>>> iterator = dictionary.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<String, List<String>> temp = iterator.next(); 
			
			System.out.println("Word : " + temp.getKey());
			
			for(String tt : temp.getValue()) {
				System.out.print("\t " + tt);
			}
			
			System.out.println();
			
		}
		
		
		
		
	}
}
