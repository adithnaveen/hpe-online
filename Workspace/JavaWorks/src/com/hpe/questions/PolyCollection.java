package com.hpe.questions;

import java.util.ArrayList;
import java.util.List;

public class PolyCollection {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		
		
		/// 
		
		List<Integer> ints = new ArrayList<Integer>(); 
		ints.add(10); 
		ints.add(20); 
		ints.add(30);
		
		List<Double> doubles = new ArrayList<Double>(); 
		doubles.add(23.4);  
		doubles.add(100.4);  
		doubles.add(1.2);  
		
		List<? extends Number> numbers = ints; 
		
		display(numbers);
		numbers = doubles; 
		display(numbers);
	}

	private static void display(List<? extends Number> numbers) {
		for(Number temp : numbers) {
			System.out.println(temp);
		}
	}
}
