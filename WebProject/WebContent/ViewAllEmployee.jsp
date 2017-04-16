<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="com.employeerelation.bean.EmployeeBean" %>
<%@ page import="java.util.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Employee Details</title>
</head>

<h2>Employee Details</h2>
<body>

<table border="1" cellpadding="5" cellspacing="1">
<tr bgcolor="#c0c0c0">
<th>EId</th><th>F_Name</th><th>M_Name</th><th>L_Name</th><th>FatherName</th><th>MotherName</th><th>DOB</th>
<th>P_Addr</th><th>C_Addr</th><th>MBL</th><th>MailId</th><th>Join_Date</th><th>Sal</th><th>Desig.</th>
</tr>

<% HashSet<EmployeeBean> hs=(HashSet)request.getAttribute("allUser");
                  Iterator<EmployeeBean> itr=hs.iterator();
                  while(itr.hasNext()){
                	 EmployeeBean empbn=(EmployeeBean)itr.next();
                	 %>
                	 
                	 <tr class ="even">
                	 <td><%= empbn.getEmployeeId() %></td>
                	 <td><%= empbn.getFastName() %></td>
                	 <td><%= empbn.getMiddleName() %></td>
                	 <td><%= empbn.getLastName() %></td>
                	 <td><%= empbn.getFatherName() %></td>
                	 <td><%= empbn.getMotherName() %></td>
                	 <td><%= empbn.getDob() %></td>
                	 <td><%= empbn.getPermanentAddress() %></td>
                	 <td><%= empbn.getCurrentAddress() %></td>
                	 <td><%= empbn.getMobileNo() %></td>
                	 <td><%= empbn.getEmailId() %></td>
                	 <td><%= empbn.getJoiningDate() %></td>
                	 <td><%= empbn.getSalary() %></td>
                	 <td><%= empbn.getDesignation()%></td>
                	 </tr>
                	 
                	 <% 
                	 }%>
                  

</table>

</body>
</html>