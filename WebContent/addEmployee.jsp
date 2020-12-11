<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>WelcomE</h1>
	<form action="add" method="post">
	<input type='number' name='empId' value ='${employee.empId}' >
	<input type='text' name='empName' value ='${employee.empName}' >
	<input type='number' name='sal' value ='${employee.sal}' >
	<input type='submit' value='SubmiT'>
	</form>
</body>
</html>