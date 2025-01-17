package com.hpe.day9;

public class Account {
	private int balance; 
	
	// simulating the DB 
	public Account(int balance) {
		this.balance = balance; 
	}
	
	public synchronized  void withDraw(int amount) {
		if(amount < balance) {
			// Alt + Shift + z
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.balance = this.balance - amount; 
			
			System.out.println("Amount Withdraws By " + 
			Thread.currentThread().getName() +" And Balance is " + this.balance); 
		}else {
			System.out.println("Sorry You dont have sufficient "
					+ "balance, present balance is " + this.balance);
		}
	}
	
	
}
