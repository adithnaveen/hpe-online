package com.hpe.day2;

public class VehicleApp {
	public static void main(String[] args) {
		
		Vehicle vh = null;  // this code should not work 
//		display(vh); 
		
		System.out.println("========================================");
		Vehicle vehicle = null ; 
		
		vehicle = new Car(); 
		display(vehicle); 
		
		System.out.println("========================================");

		vehicle = new Truck(); 
		display(vehicle);
	}
	
	
	
	//you can pass anything until the object 
	// is instance of Vehicle 
	
	// the same object behaving differently 
	// at different point in time. 
	public static void display(Vehicle vehicle) {
		vehicle.move(); 
		vehicle.stop(); 
		vehicle.driveLicense(); 
		
		
		if(vehicle instanceof Car) {
			((Car)vehicle).fuelCapacity(10); 
		}else if(vehicle instanceof Truck) {
			((Truck)vehicle).carrierCapacity(); 
		}
		
	}
	
	
}
