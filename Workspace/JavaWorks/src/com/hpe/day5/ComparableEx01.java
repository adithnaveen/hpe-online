package com.hpe.day5;

import java.util.Arrays;

public class ComparableEx01 {
	public static void main(String[] args) {
		String [] strs = {"Harry", "Peter", "Laura", "Zara", "Dinesh"};
		
		for(String temp : strs) {
			System.out.println(temp);
		}
		
		System.out.println("==================================");
		
		Arrays.sort(strs);

		for(String temp : strs) {
			System.out.println(temp);
		}
		
	}
}
