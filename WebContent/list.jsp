<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
   <%@ page import = "java.util.*,model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Employees Table </h1>
	
	
 <table align="left" border="1">
  <tr>
   <th>Employee ID</th>
   <th>Employee Name</th>
   <th>Employee Salary</th>
 </tr>
  <core:forEach items="${employees}" var="employee"> 
   <tr>
    <td><core:out value="${employee.empId}"/></td>
    <td><core:out value="${employee.empName}"/></td>
    <td><core:out value="${employee.sal}"/></td>
    
   </tr>
  </core:forEach>
 </table>
</body>
</html>