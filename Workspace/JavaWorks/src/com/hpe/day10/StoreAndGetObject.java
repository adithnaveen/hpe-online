package com.hpe.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serializable is a marker interface which does not have 
// any methods 

// this interface is basically needed for giving additional information 
// at run time 
class Employee implements Serializable {
	private int empId;
	private String empName;
	private double income;

	public Employee() {
	}

	public Employee(int empId, String empName, double income) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.income = income;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

}

public class StoreAndGetObject {

	public static void saveEmployee(Employee employee) {

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("emps.ser"));

			oos.writeObject(employee);
			oos.writeInt(100);
			oos.writeObject("Hello How Are you Doing Today");

			System.out.println("Data Saved Successfully... ");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

	public static Employee getEmployee() {

		ObjectInputStream ois;

		try {
			ois = new ObjectInputStream(new FileInputStream("emps.ser"));
			Employee employee = (Employee) ois.readObject();
			
			System.out.println("Integer Stored is " + ois.readInt());
			System.out.println("String Got is " + ois.readObject());
			
			return employee;
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		return null; 
	}

	public static void main(String[] args) {
		/*
		 * Employee emp = new Employee(101, "Naveen", 1212); saveEmployee(emp);
		 */
		
		Employee emp = getEmployee(); 
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getIncome());
		
	}
}
