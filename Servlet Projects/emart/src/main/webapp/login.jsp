<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	
	
	<form action="login" method="post">
		<label for="email">Email</label><input id="email" type="email" name="email" placeholder="enter your email">
		<label for="password">Password</label><input id="password" type="password" name="password" >
		<button type="submit">submit</button>
	</form>
	
	
	
	
	<span>Don't have an account <a href="create.jsp">Click Here</a> to Create Account</span>
</body>
</html>