<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer History</title>
</head>
<body>
<%
	out.println("Account Number" +session.getAttribute("raccnoList"));
%>
<%
	out.println("Amount" +session.getAttribute("amountList"));
%>
</body>
</html>