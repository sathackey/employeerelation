package com.employeerelation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employeerelation.bean.EmployeeBean;
import com.employeerelation.util.EmployeeUtil;

public class EmployeeDao {
	
	boolean check= false;
	Connection con=null;
	
	public int register(EmployeeBean empBean) throws SQLException{
		
		String querry = "insert into employeerelation values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		con = EmployeeUtil.getConnection();
		
		PreparedStatement ps = con.prepareStatement(querry);
		ps.setInt(1, empBean.getEmployeeId());
		ps.setString(2, empBean.getFastName());
		ps.setString(3, empBean.getMiddleName());
		ps.setString(4, empBean.getLastName());
		ps.setString(5, empBean.getFatherName());
		ps.setString(6, empBean.getMotherName());
		ps.setString(7, empBean.getDob());
		ps.setString(8, empBean.getPermanentAddress());
		ps.setString(9, empBean.getCurrentAddress());
		ps.setLong(10, empBean.getMobileNo());
		ps.setString(11, empBean.getEmailId());
		ps.setString(12, empBean.getJoiningDate());
		ps.setDouble(13, empBean.getSalary());
		ps.setString(14, empBean.getDesignation());
		
		int no=ps.executeUpdate();
		return no;	
	}
	
	public boolean checkUser(String sql){
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()==true){
			   check= false;
			}else{
				check=true;
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return false;	
	}
}
