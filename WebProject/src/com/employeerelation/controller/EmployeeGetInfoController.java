package com.employeerelation.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeerelation.bean.EmployeeBean;
import com.employeerelation.util.EmployeeUtil;

public class EmployeeGetInfoController extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String querry = "select * from employeerelation";
		try {
		    Connection con = EmployeeUtil.getConnection();
		    Statement st = con.createStatement();
		
			ResultSet rs = st.executeQuery(querry);
			
			HashSet<EmployeeBean> hs= new HashSet<EmployeeBean>();
			while (rs.next()) {
				EmployeeBean eb = new EmployeeBean();
				eb.setEmployeeId(rs.getInt(1));
				eb.setFastName(rs.getString(2));
				eb.setMiddleName(rs.getString(3));
				eb.setLastName(rs.getString(4));
				eb.setFatherName(rs.getString(5));
				eb.setMotherName(rs.getString(6));
				eb.setDob(rs.getString(7));
				eb.setPermanentAddress(rs.getString(8));
				eb.setCurrentAddress(rs.getString(9));
				eb.setMobileNo(rs.getLong(10));
				eb.setEmailId(rs.getString(11));
				eb.setJoiningDate(rs.getString(12));
				eb.setSalary(rs.getDouble(13));
				eb.setDesignation(rs.getString(14));
				
				hs.add(eb);
				
			}
			
			req.setAttribute("allUser", hs);
			RequestDispatcher rd = req.getRequestDispatcher("ViewAllEmployee.jsp");
			rd.forward(req, res);
			
		} catch (SQLException e) {
			System.out.println("Database Error..");
			e.printStackTrace();
		}
	}
}
