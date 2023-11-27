<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	out.println(session.getAttribute("id") + "  " 
	+ session.getAttribute("name") + "  " 
			+ session.getAttribute("m1")
			+ "  " + session.getAttribute("m2") + "  " 
			+ session.getAttribute("m3"));
	%>
</body>
</html>