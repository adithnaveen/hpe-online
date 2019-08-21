package com.hpe.day7;

import java.util.ArrayList;
import java.util.List;

public class ListObjectStore {
	public static void main(String[] args) {
		
		List<Devices> devices  = new ArrayList<Devices>(); 
		
		devices.add(new Devices(101, "Computer", 400)); 
		devices.add(new Devices(123, "Laptop", 700)); 
		devices.add(new Devices(234, "Mobile", 300)); 
		devices.add(new Devices(222, "Mouse", 29)); 
		devices.add(new Devices(222, "Mouse", 29)); 
		devices.add(new Devices(222, "Mouse", 29)); 
		devices.add(new Devices(222, "Mouse", 29)); 
		devices.add(new Devices(222, "Mouse", 29)); 
		devices.add(new Devices(222, "Mouse", 29)); 
		
		
		for(Devices temp : devices) {
			System.out.println(temp);
		}
		
		devices.remove(0); 

		System.out.println("---------------------------------");
		for(Devices temp : devices) {
			System.out.println(temp);
		}
		
		
		
		
	}
}
