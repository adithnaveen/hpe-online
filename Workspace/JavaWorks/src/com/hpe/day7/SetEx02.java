package com.hpe.day7;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {
	public static void main(String[] args) {
		Set<Devices> set = new HashSet<Devices>(); 
		
		set.add(new Devices(101, "Computer", 400) ); 
		set.add(new Devices(123, "Laptop", 700)); 
		set.add(new Devices(234, "Mobile", 300)); 
		set.add(new Devices(222, "Mouse", 29)); 
		set.add(new Devices(222, "Mouse", 29)); 

		for(Devices temp : set) {
			System.out.println(temp + ", " + temp.hashCode()) ;
		}
	
	}
}
