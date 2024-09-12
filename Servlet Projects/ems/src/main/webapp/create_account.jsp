<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create_account</title>
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
	<h1>create account Page</h1>

	<form action="save_user" method="post">
		<input type="number" name="id" placeholder="Enter Employe ID">
		<input type="email" name="email" placeholder="Enter Employe email">
		<input type="text" name="name" placeholder="Enter Employe Name">
        <input type="number" name="sal" placeholder="Enter Employe Salary">
		<input type="number" name="deptno" placeholder="Enter Employe Dept No">
		<input type="password" name="password"placeholder="please enter password"> 
		<button type="submit">Create Employee</button>
	</form>

</body>
</html>