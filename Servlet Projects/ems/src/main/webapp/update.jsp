<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update page</title>

<style type="text/css">
h1 {
	text-align: center;
	color: red;
}

form {
	display: flex;
	flex-direction: column;
	width: 30%;
	margin: auto;
	gap: 10px;
	border-radius: 20%;
}
</style>

</head>
<body>
	<h1>update employee details</h1>

	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>
	<form action="update" method="post">
		<input value="<%=rs.getInt(1) %>" type="text" name="id" placeholder="Enter Employe ID">
		<input value="<%=rs.getString(2) %>" type="email" name="email" placeholder="update Employe email">
		<input value="<%=rs.getString(3) %>" type="text" name="name" placeholder="update Employe Name">
		<input value="<%=rs.getInt(4) %>" type="text" name="sal" placeholder="update Employe Salary">
		<input value="<%=rs.getInt(5) %>" type="text" name="deptno" placeholder="update Employe Dept No">
		<input value="<%=rs.getString(6)%>" type="text" name="password"placeholder="update password">
		<button type="submit">update Employee</button>
	</form>
</body>
</html>