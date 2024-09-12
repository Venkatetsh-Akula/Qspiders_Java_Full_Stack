<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table{
	/* border: 1px solid black; */
	margin:auto
}
</style>
</head>
<body>
	<table border="2px">
		<tr>
			<td>Login Name</td>
			<td>Password</td>
		</tr>
	<% 
		ResultSet rs=(ResultSet)request.getAttribute("rs");
		while(rs.next()){	
	%>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><a href="delete?user=<%=rs.getString(1) %>">Delete Record</a></td>
		</tr>
	<%} %>
	
	</table>
</body>
</html>