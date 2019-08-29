package com.hpe.client;

import com.hpe.beans.Employee;
import com.hpe.dao.EmployeeDAO;
import com.hpe.standards.IEmployeeDAO;

public class App {
	public static void main(String[] args) {
		IEmployeeDAO employeeDao = new EmployeeDAO();

		/*
		 * Employee employee = new Employee(103, "Jeffery", "jeffery@hpe.com");
		 * 
		 * System.out.println(employeeDao.insertEmployee(employee) ? "Record Inserted "
		 * :"Record Not Inserted ");
		 */

		// update
		/*
		 * System.out.println(employeeDao.updateEmployee (101,
		 * "naveen@gmail.com")?"Update":"Sorry Not Update");
		 */

		// select
//		Employee employee = employeeDao.getEmployee(101);

//		System.out.println(employee);
		
		// select all 
		for(Employee temp : employeeDao.getAllEmployees()) {
			System.out.println(temp);
		}
		employeeDao.deleteEmployee(101);
		System.out.println("--------- After Delete ------------");
		for(Employee temp : employeeDao.getAllEmployees()) {
			System.out.println(temp);
		}
		
	}
}
