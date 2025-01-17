package com.hpe.day9;

class MyBusiness extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Value of i is " + i + " in " + 
						Thread.currentThread().getName() +", priority " + 
						Thread.currentThread().getPriority());
		}

		System.out.println("Thread " + Thread.currentThread().getName() + " is exiting... ");

	}
}


//1. 5 - NORM_PRIORITY 
//2. 10 - MAX_PRIORITY 
//3. 1 - MIN_PRIORITY 

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println("Hi i'm in Main ");
		System.out.println("My name is " + Thread.currentThread().getName());

		MyBusiness harry = new MyBusiness();
		harry.setName("Harry");
		harry.setPriority(Thread.NORM_PRIORITY+1);
		harry.start(); // make a call to manin -> jvm -> OS

		MyBusiness peter = new MyBusiness();
		harry.setPriority(Thread.MAX_PRIORITY);
		peter.setName("Peter");
		peter.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("Value of i is " + i + " in " + 
						Thread.currentThread().getName() +", Priority " + 
						Thread.currentThread().getPriority());
		}

		try {
			harry.join();
			peter.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("Thread " + Thread.currentThread().getName() + " is exiting... ");

	}
}
