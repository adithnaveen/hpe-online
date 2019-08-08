package com.hpe.basics;

public class MathOperations {
	public static void main(String[] args) {
		System.out.println("Even series ");
		// 2, 4, 6, 8, 10 
		
		int maxLimit = 20; 
		
		for(int i=0; i<=maxLimit; i++) {
			if(i%2 ==0) {
				System.out.println(i);
			}
		}
	}
}
