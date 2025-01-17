package com.hpe.day8;

public class ExceptionEx02 {

	public static void validateName(String name) throws NameTooShortException {
		if (name.length() < 6) {

			throw new NameTooShortException("Sorry Not Processed, it small name " + name + " minimum 6 Chars");
		}
	}

	public static void checkSalary(String name, int salary) throws SalaryTooLowException, Exception {
		try {
			validateName(name);
			if (salary < 1000) {
				throw new SalaryTooLowException("Your Salary is too low.. " + name);
			} else if (salary >= 1000 && salary < 5000) {
				throw new SalaryTooLowException("Hey you have the scope to earm more " + name);
			} else {
				System.out.println("Hey hope you are doing well " + name);
			}
		} catch (NameTooShortException ntse) {
			throw new Exception("Sorry Salary Check Did not proceed", ntse);
		}
	}

	public static void main(String[] args) {
		try {
			checkSalary("Ha", 9000);
		} catch (SalaryTooLowException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
