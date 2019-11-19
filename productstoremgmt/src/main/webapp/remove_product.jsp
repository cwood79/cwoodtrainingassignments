<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="/productstoremgmt/removep" method="post">
Id: <f:input path="id" />
		<br>
		<input type="submit" value="Submit" />
	</f:form>
</body>
</html>