<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Balance Details</h2>
<%
out.println("Name: "+session.getAttribute("name")+"<br>"+"Account Number :"
+session.getAttribute("accno")
+"<br>"+"Balance:"+session.getAttribute("balance"));
%>

</center>
</body>
</html>