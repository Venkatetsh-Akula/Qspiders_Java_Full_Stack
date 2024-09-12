<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{
	margin:auto;
}
</style>
</head>
<body>
	<table height="200px" wdith="200px" border=2px>
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Phone</td>
		</tr>
	<% 
		ResultSet rs=(ResultSet) request.getAttribute("rs");
		while(rs.next()){
	%>
		<tr>
			<td>ID:<%=rs.getInt(1)%></td>
			<td>Name:<%=rs.getString(2)%></td>
			<td>Phone:<%=rs.getLong(3)%></td>
		</tr>
	<% }%>
	</table>
</body>
</html>