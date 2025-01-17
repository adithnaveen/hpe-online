package com.hpe.day6;

import java.util.Arrays;

public class LambdaEx01 {
	public static void main(String[] args) {
		int [] ints = {10, 20, 30, 50}; 
		
		for(int x =0; x<ints.length; x++) {
			System.out.println(ints[x]);
		}
//		------------------------------------
		
		for(int temp : ints) {
			System.out.println(temp);
		}
//		------------------------------------
		
		Arrays.asList(ints).forEach
			(temp -> System.out.println(temp));
		
//		-------------------------------------
		Arrays.asList(ints).forEach(System.out :: println);
		
		
	}
}
