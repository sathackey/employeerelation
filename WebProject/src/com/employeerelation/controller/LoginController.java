package com.employeerelation.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employeerelation.dao.EmployeeDao;

public class LoginController {
	
	EmployeeDao emp = new EmployeeDao();
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		String user = req.getParameter("username");
		String pwd = req.getParameter("password");
		
		String sel_querry = "select username, password from Emp_Login where uname='"+user+"'and password='"+pwd+"'";
		
		boolean user_exsist=emp.checkUser(sel_querry);
		if(user_exsist==true){
		HttpSession session = req.getSession();
		session.setAttribute("uname", user);
		}
		else{
			res.sendRedirect("loginfail.jsp");
		}
		
		
	}
}
