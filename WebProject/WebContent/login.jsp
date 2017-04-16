<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body background="image.jpg" >



<h2>Employee Login</h2>

<form action="./login">
<fieldset>
<legend>Employee-Login</legend>
<table>

<tr><td>User Name:</td> <td><input type="text" name="username"></td></tr>
<tr><td>Password:</td> <td><input type="text" name="password"></td></tr>
<tr><td><input type="submit" value="Login"></td></tr>

</table>
</fieldset>
</form>

<form action="./getdetail">
<input type="submit" value="Get All Employees">
</form>
<form >

</form>



</body>
</html>