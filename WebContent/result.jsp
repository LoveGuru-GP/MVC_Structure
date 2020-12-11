<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Entered Values are </h1>
	Id is <%= request.getAttribute("id") %> <br/>
	Name is <%= request.getAttribute("name") %> <br/>
	Salary is <%= request.getAttribute("sal") %> <br/>
</body>
</html>