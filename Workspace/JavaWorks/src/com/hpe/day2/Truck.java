package com.hpe.day2;

// in this class we have carrierCapacity 
//move and stop (parent) 
public class Truck extends Vehicle{
	public Truck() {
		System.out.println("Truck creationin progress.. ");
	}
	public void carrierCapacity() {
		System.out.println("Every truck has carrierCapacity...");
	}
	
	// change or technicall call it as override 
	
	public void move() {
		System.out.println("The truck is moving...");
	}

	public void stop() {
		System.out.println("The Truck is stopped.. ");
	}
	
	
}
