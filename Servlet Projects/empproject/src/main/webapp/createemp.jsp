<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Employee Data</title>
</head>
<body>
	<h3>Enter the all employee Details</h3>
	<form action="details" method="post">
		<label>Enter employee number</label><input type="number" name="id">
		<label>Enter employee name</label><input type="text" name="name">
		<label>Enter the department number</label><input type="number" name="deptno">
		<label>Enter the employee salary</label><input type="number" name="sal">
		<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>