package com.hpe.questions;


class CounterThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("i'm here to track counter ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}









public class DeamonThreadEx extends Thread  {

	public DeamonThreadEx(String name) {
		super(name); 
	}
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() +" is a deamon Thread");
		}else {
			
			System.out.println(Thread.currentThread().getName() +" is a Thread");
			
			for(int i=0; i<20; i++) {
				System.out.println("i value in thread " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		CounterThread ct = new CounterThread(); 
		ct.setDaemon(true);
		ct.start(); 
		
		DeamonThreadEx thread1  = new DeamonThreadEx("First"); 
		thread1.setPriority(5);
		thread1.start(); 
		
		DeamonThreadEx thread2  = new DeamonThreadEx("second"); 
		thread2.setPriority(6);
		thread2.start(); 
		
		DeamonThreadEx thread3  = new DeamonThreadEx("Third"); 
		thread3.setPriority(10);
		thread3.start(); 
		
		
		
		
	}
}
