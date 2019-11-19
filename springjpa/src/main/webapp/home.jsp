<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>         
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<table border="1">
<tr>
<th>Id</th><th>Name</th><th>Mobile</th><th>Mail ID</th>
</tr>
<c:forEach items="${customers}" var="customer">
<tr>
<td>${customer.custId}</td>
<td>${customer.username }</td>
<td>${customer.mobile }</td>
<td>${customer.mailId }</td>
</tr>
</c:forEach>
</table>
</body>




</html>