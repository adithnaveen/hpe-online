package com.hpe.day9;

class SomeBusinessLogic{}

class YourBusinessLogic extends SomeBusinessLogic  implements Runnable{

	
	// version 1 
	
	Thread thread; 
	public YourBusinessLogic(String name, int priority) {
		thread = new Thread(this); 
		thread.setName(name); 
		thread.setPriority(priority);
		// the method here will make a call to JVM 
		// it makes a call to OS (informs), 
		// the the JVM would invoke the run() method 
		thread.start(); 
	}
	
	// version 2 
	public YourBusinessLogic() {} 
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Value of i is " + i + " in " + 
						Thread.currentThread().getName() +", priority " + 
						Thread.currentThread().getPriority());
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				ie.printStackTrace(); 
			}
		}

		System.out.println("Thread " + Thread.currentThread().getName() + " is exiting... ");
	}
	
}
public class ThreadEx02 {
	public static void main(String[] args) {
		YourBusinessLogic ybl1 = new YourBusinessLogic("Harry", 5); 
		YourBusinessLogic ybl2 = new YourBusinessLogic("Peter", 7); 

		YourBusinessLogic ybl3 = new YourBusinessLogic(); 
		Thread andy = new Thread(ybl3); 
		andy.setPriority(8);
		andy.setName("Andy");
		andy.start(); 
		
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Value of i is " + i + " in " + 
						Thread.currentThread().getName() +", Priority " + 
						Thread.currentThread().getPriority());
		}
		
	}
}
