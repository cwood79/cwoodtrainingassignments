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
	<h1>Delete Trainee</h1>
	<f:form action="/springmvclab2/removet" method="post">
		Please enter trainee ID: <f:input path="traineeId" />
		<input type="submit" value="Delete" />
	</f:form>
</body>
</html>

