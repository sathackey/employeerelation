package com.employeerelation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeUtil {
	
	public static Connection getConnection() throws SQLException{
		
		
		Connection con = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "system";
		System.out.println("Connection");
		try{
			Class.forName(driver);
			
		}catch(Exception e){
			System.out.println("Driver not found");
		}
		con = DriverManager.getConnection(url, user, pwd);
		
		return con;
	}
}
