<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
Username: <input type="text" name="user"/><br>
Password: <input type="password" name="pass"/><br>
<button type="submit">Submit</button>
<a href="register.jsp">Register</a>
</form>

</body>
</html>