package com.hpe.standards;

import java.sql.SQLException;
import java.util.List;

import com.hpe.beans.Employee;

public interface IEmployeeDAO {
//	1. insert 
	public boolean insertEmployee(Employee employee); 
	
//	2. update 
	public boolean updateEmployee(int empId, String email); 
	
//	3. delete 
	public boolean deleteEmployee(int empId); 
	
//	4. select - one
	public Employee getEmployee(int empId) throws SQLException; 
	
//	5. select - all
	public List<Employee> getAllEmployees(); 
}
