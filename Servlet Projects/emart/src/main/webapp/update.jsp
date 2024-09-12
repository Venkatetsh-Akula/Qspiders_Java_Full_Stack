<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<h1>Update Page</h1>
	<%ResultSet rs=(ResultSet) request.getAttribute("rs"); %>
	<h1><%=rs.getInt(1) %></h1>
	<h1><%=rs.getString(2) %></h1>
	<h1><%=rs.getString(3) %></h1>
	<h1><%=rs.getLong(4) %></h1>
	<h1><%=rs.getString(5) %></h1>
	<h1><%=rs.getString(6) %></h1>
	<form action="updatedata" method="post">
		ID:<input type="text" name="id" value=<%=rs.getInt(1) %>>
		Name:<input type="text" name="name" value=<%=rs.getString(2) %>>
		ID<input type="email" name="email" value=<%=rs.getString(3) %>>
		ID<input type="number" name="phone" value=<%=rs.getLong(4) %>>
		ID<input type="text" name="role" value=<%=rs.getString(5) %>>
		ID<input type="password" name="password" value=<%=rs.getString(6) %>>
		<button type="submit">Update</button>
	</form>
</body>
</html>