package com.hpe.day9;

public class BankingClient implements Runnable{

	private Account account; 
	String name; 
	Thread thread; 
	int amount; 
	public static void main(String[] args) {
		Account account = new Account(1000); 
		
		new BankingClient(account, "A", 500); 
		new BankingClient(account, "B", 750); 
	}
	
	public BankingClient(Account account, String name, int amount) {
		this.account = account; 
		this.name = name; 
		this.amount = amount; 
		thread = new Thread(this); 
		thread.setName(name);
		// this will create OS level thread and gives the call 
		// to run() method 
		thread.start(); 
	}

	@Override
	// this works async 
	public void run() {
		
		/*
		 * synchronized (account) { account.withDraw(amount); }
		 */
		
		account.withDraw(amount);
		
	}
	
}
