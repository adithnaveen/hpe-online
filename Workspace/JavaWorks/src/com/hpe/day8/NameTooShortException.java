package com.hpe.day8;

public class NameTooShortException extends Exception {
	private String message; 
	
	public NameTooShortException() {
		this.message =  "Name Too Short"; 
	}
	
	public NameTooShortException(String message) {
		this.message = message; 
	}

	@Override
	public String toString() {
		return "NameTooShortException [message=" + message + "]";
	}
	
	
}
