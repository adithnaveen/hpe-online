package com.hpe.day7;

import java.util.HashSet;

public class SetEx01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		System.out.println(set.add("Jeffery"));
		System.out.println(set.add("Arun"));
		System.out.println(set.add("Tze Wei"));
		// when ever you want to keep the data 
		// java has to identify the hashcode (the place where) 
		//  the data has to be kept, and check if the same record 
//		exists. 
		System.out.println(set.add("Miguel"));
		System.out.println(set.add("Miguel"));
		System.out.println(set.add("Miguel"));
		System.out.println(set.add("Miguel"));

		for(String temp : set) {
			System.out.println(temp +", " + temp.hashCode());
		}

	}
}
