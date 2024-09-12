<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 form{
 display: flex;
 flex-direction: column;
 width: 50%;
 margin: auto;
 gap:10px;
 }
 h3 {
	 text-align: center;
}
h1 {
	 text-align: center;
}
</style>

</head>
<body>
	<form action="login" method="post">
		<h1>login page</h1>
		<input type="email" name="email" placeholder="enter email"
			required="required"> <input type="password" name="password"
			placeholder="enter password">
		<button type="submit">login</button>

	</form>
	<h3>
		you don't have account:- <a href="create_account">create account</a>
	</h3>

</body>
</html>