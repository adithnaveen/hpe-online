package com.hpe.day6;

import java.util.Vector;

public class ListEx03 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(); 
		
		System.out.println("Before -- The size " + vector.size());
		System.out.println("Before -- Capacity " + vector.capacity());
		
		vector.add("Harry"); 
		vector.add("Laura"); 
		vector.add("Harry"); 
		vector.add("Laura"); 
		vector.add("Harry"); 
		vector.add("Laura"); 
		vector.add("Harry"); 
		vector.add("Laura"); 
		vector.add("Harry"); 
		vector.add("Laura"); 
		vector.add("Naveen"); 
		
		System.out.println("After -- The size " + vector.size());
		System.out.println("After -- Capacity " + vector.capacity());
		
	}
}
