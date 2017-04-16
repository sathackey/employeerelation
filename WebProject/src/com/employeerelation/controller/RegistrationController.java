package com.employeerelation.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeerelation.bean.EmployeeBean;
import com.employeerelation.dao.EmployeeDao;

public class RegistrationController extends HttpServlet {
	
	RequestDispatcher rd = null;
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		
		String empid = req.getParameter("empid");
		int eid = Integer.parseInt(empid);
		String fname=req.getParameter("fname");
		String mname=req.getParameter("mname");
		String lname=req.getParameter("lname");
		String fathername=req.getParameter("fathername");
		String mothername=req.getParameter("mothername");
		String dob=req.getParameter("dob");
		String permanentaddress=req.getParameter("permanentaddress");
		String currentaddress=req.getParameter("currentaddress");
		String mblno=req.getParameter("mbl"); 
		long mbl = Long.parseLong(mblno);
		String email = req.getParameter("email");
		String joiningdate= req.getParameter("joiningdate");
		String salary = req.getParameter("salary");
		double sal = Double.parseDouble(salary);
		String designation = req.getParameter("designaiton");
		
		EmployeeBean empBean= new EmployeeBean();
		empBean.setEmployeeId(eid);
		empBean.setFastName(fname);
		empBean.setMiddleName(mname);
		empBean.setLastName(lname);
		empBean.setFatherName(fathername);
		empBean.setMotherName(mothername);
		empBean.setDob(dob);
		empBean.setPermanentAddress(permanentaddress);
		empBean.setCurrentAddress(currentaddress);
		empBean.setMobileNo(mbl);
		empBean.setEmailId(email);
		empBean.setJoiningDate(joiningdate);
		empBean.setSalary(sal);
		empBean.setDesignation(designation);
		
		EmployeeDao empdao= new EmployeeDao();
		int no=0;
		try {
			no = empdao.register(empBean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(no>0){
			rd = req.getRequestDispatcher("RegistrationSuccessfull.jsp");
			rd.forward(req, res);
		}else{
			
			rd = req.getRequestDispatcher("RegistraiongFailure.jsp");
			rd.forward(req, res);
		} 
		
				
		
		
	}

}
