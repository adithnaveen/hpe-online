package com.hpe.day8;

public class SalaryTooLowException extends Exception {

	private String message;

	public SalaryTooLowException() {
		message = "Sorry the salary is too low ";
	}

	public SalaryTooLowException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SalaryTooLowException [message=" + message + "]";
	}

	@Override
	public String getMessage() {
		return ":::::" + this.message +":::::::"; 
	}

	
	
}
