package com.hpe.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {

	static Connection connection; 
	
	public PreparedStatement ps, ps1, ps2, ps3; 
	public ResultSet rs ; 
	
	public static  Connection getMySQlConnection() {
		// if you invoke Class.forName this will invoke the static {} of 
		// the class associated 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection
						("jdbc:mysql://localhost/hpe_online_aug_2019", 
								"root", "kanchan");
			
			return connection; 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null; 
		
	}
}
