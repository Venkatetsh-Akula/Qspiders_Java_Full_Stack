<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account Page</title>
</head>
<body>
	<form action="create" method="post">
	<label for="id">ID</label><input id="id" type="text" name="id" placeholder="enter ID">
		<label for="name">Name</label><input id="name" type="text" name="name" placeholder="enter name">
		<label for="email">Email</label><input id="email" type="mail" name="email" placeholder="enter email">
		<label for="phone">Phone Number</label><input id="phone" type="tel" name="phone" placeholder="enter phone number">
		<label for="password">Password</label><input id="password" type="password" name="password" placeholder="enter password">
		<label for="role">Role</label>
			<select id="role" name="role" >
				<option value="USER">---select---</option>>
				<option value="USER">USER</option>
				<option value="ADMIN">ADMIN</option>
			</select>
		<button type="submit">Submit</button>
	</form>
	<span>If you have Already Account <a href="login_page">Click Here</a></span>
</body>
</html>