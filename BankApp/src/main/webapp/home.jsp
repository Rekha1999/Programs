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
	out.println("Welcom"+session.getAttribute("name")+"!!");
%>
<br>
<a href = "checkBalance">Check Balance</a>
<br>
<a href = "/BankApp/transferMoney.html">Transfer Money</a>
<br>
<a href = "/BankApp/ChangePassword.html">Change Password</a>
<br>
<a href = "TransferHistory">Transfer History</a>
<br>
<a href = "ChangeDetails.html">Change User Details</a>
<br>
<a href="Logout">Logout</a>

</body>
</html>