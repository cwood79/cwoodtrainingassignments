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

	<h1>Enter Trainee Details</h1>
		<f:form action="/springmvclab2/addt" method="post">
Trainee Id: <f:input path="traineeId" />
		<br>
Trainee Name:<f:input path="traineeName" />
		<br>
Trainee Location<f:input path="traineeLocation"/>
		<br>
Trainee Domain<f:input path="traineeDomain"/>
		<input type="submit" value="Submit" />
	</f:form>
</body>
</html>

