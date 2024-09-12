<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details web page</title>
</head>
<body>
	<pre>${credentials}</pre>
	<form method="post" action="/login">
		<label>Enter your name:<input type="text" name="name"></label>
		<label>Enter your password:<input type="password" name="password"></label>
		<button type="submit">Submit</button>
	</form>
</body>
</html>
