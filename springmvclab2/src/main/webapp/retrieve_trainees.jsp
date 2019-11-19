<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Trainee details</h1>

	<table border="1">
		<tr>
			<th>Trainee Id</th>
			<th>Trainee Name</th>
			<th>Trainee Location</th>
			<th>Trainee Domain</th>
		</tr>
		<c:forEach items="${trainees}" var="trainee">
			<tr>
				<td>${trainee.traineeId}</td>
				<td>${trainee.traineeName}</td>
				<td>${trainee.traineeLocation}</td>
				<td>${trainee.traineeDomain} </td>
			</tr>
		</c:forEach>

</body>
</html>