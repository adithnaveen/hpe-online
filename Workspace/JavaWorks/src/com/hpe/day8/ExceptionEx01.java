package com.hpe.day8;

public class ExceptionEx01 {
	public static void main(String[] args) {
		try {
			int x = Integer.parseInt(args[0]); 
			int y = Integer.parseInt(args[1]); 
			
			try {
				int [] arr = new int[-10];
			}catch(NegativeArraySizeException nase) {
				System.out.println(nase); 
			}
			
			int z = x/y; 
			
			System.out.println("Result is " + z);
			
		}catch(ArithmeticException | NumberFormatException e) {
			System.out.println("Exception message : " + e);
			
		}catch(Exception e) {
			System.out.println("Sorry something went wrong contact Team " + e);
		}finally {
			System.out.println("Hey i'm finally..... ");
		}
		
		System.out.println("This is some other business logic ");
	}
}
