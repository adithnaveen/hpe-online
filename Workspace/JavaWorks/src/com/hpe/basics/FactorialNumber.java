package com.hpe.basics;

public class FactorialNumber {
	public static void main(String[] args) {
		// 5 = 120 (5x43x2x1)
		
		int num = 5; 
		int result =1; 
		
		for(int i=num; i>0;i--) {
			result = result * i;   
		}
		
		System.out.println("Result is " + result);
		
	}
}
