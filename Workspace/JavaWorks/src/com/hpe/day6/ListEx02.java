package com.hpe.day6;

import java.util.ArrayList;
import java.util.Iterator;

// type safe 
public class ListEx02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		System.out.println("list size before adding " + list.size());
		list.add(10); 
		list.add(20);
		list.add(30);
		list.add(40);
//		list.add(23.4);
		System.out.println("list size after adding " + list.size());
		
		System.out.println(list.toString());
		
		// ctrl +2 (l) 

		Iterator<Integer> iterator = list.iterator(); 
		
		while(iterator.hasNext()) {
			Integer val = iterator.next(); 
			System.out.println(val);
		}
		
		list.remove(0); 
		System.out.println(list);
		
		list.add(1, 1000);
		System.out.println(list);
		
		
		
		// try to create a sublist from elements 0,4 
		// erase all elements in the list 
		// 10, need to check if its present 
		
		
		
	}
}
