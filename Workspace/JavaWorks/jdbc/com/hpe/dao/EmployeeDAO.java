package com.hpe.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hpe.beans.Employee;
import com.hpe.connection.GetConnection;
import com.hpe.standards.IEmployeeDAO;

public class EmployeeDAO  implements IEmployeeDAO{

	@Override
	public boolean insertEmployee(Employee employee) {
		//? called as positional parameters (start from 1) 
		String sql ="insert into employee values (?,?,?)"; 
		// 1000 
		GetConnection gc = new GetConnection(); 
		
		try {
			gc.ps = GetConnection.getMySQlConnection().prepareStatement(sql); 
			
			gc.ps.setInt(1, employee.getEmpId());
			gc.ps.setString(2, employee.getEmpName());
			gc.ps.setString(3, employee.getEmail());
			
			return gc.ps.executeUpdate()>0; 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			
		}
		
		return false;
	}

	@Override
	public boolean updateEmployee(int empId, String email) {

		String sql ="update employee set emp_email = ? where emp_id =?";
		
		try {
			GetConnection gc  = new GetConnection(); 
			gc.ps = GetConnection.getMySQlConnection().prepareStatement(sql); 
			
			gc.ps.setString(1, email);
			gc.ps.setInt(2, empId);
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {

		String sql ="delete from employee where emp_id =?";
		
		GetConnection gc = null; 
		try {
			gc = new GetConnection(); 
			
			gc.ps = GetConnection.getMySQlConnection().prepareStatement(sql); 
			gc.ps.setInt(1, empId);
			
			return gc.ps.executeUpdate() > 0 ;
		}catch(SQLException sqle) {
			sqle.printStackTrace(); 
		}finally {
			try {
			gc.ps.close();
			}catch(SQLException sqlee) {
				sqlee.printStackTrace(); 
			}
		}
		
		return false;
	}

	@Override
	public Employee getEmployee(int empId) throws SQLException {
		String sql = "select * from employee where emp_id=?"; 
		
		GetConnection gc = null; 
		try {
			gc = new GetConnection(); 
			gc.ps = GetConnection.getMySQlConnection().prepareStatement(sql); 
			gc.ps.setInt(1, empId);
			
			gc.rs = gc.ps.executeQuery(); 

			if(gc.rs.next()) {
				Employee employee  = new Employee(); 
				employee.setEmpId(gc.rs.getInt(1));
				employee.setEmpName(gc.rs.getString(2));
				employee.setEmail(gc.rs.getString(3));
				
				return employee; 
			}
		}finally {
			try {
				gc.ps.close(); 
				gc.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// this may return more than 1 record/s
		String sql ="select emp_id, emp_name, emp_email from employee";
		
		GetConnection gc = new GetConnection();
		List<Employee> emps =  new ArrayList<>(); 
		try {
			gc.ps  = GetConnection.getMySQlConnection().prepareStatement(sql); 
			
			gc.rs = gc.ps.executeQuery(); 
			
			while(gc.rs.next()) {
				Employee employee  = new Employee(); 
				employee.setEmpId(gc.rs.getInt(1));
				employee.setEmpName(gc.rs.getString(2));
				employee.setEmail(gc.rs.getString(3));
				
				emps.add(employee); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return emps; 
	}

}
