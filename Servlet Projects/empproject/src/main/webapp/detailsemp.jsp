<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h2>Employee Details</h2>
	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	while (rs.next()) {
	%>
	<h1><%=rs.getInt(1) %></h1>
	<h1><%=rs.getString(2) %></h1>
	<h1><%=rs.getInt(3) %></h1>
	<h1><%=rs.getInt(4) %></h1>
	<a href="delete?empno=<%= rs.getInt(1)%>"><button>Delete The Above Employee</button>
	<% }%>
	<br>
</body>
</html>