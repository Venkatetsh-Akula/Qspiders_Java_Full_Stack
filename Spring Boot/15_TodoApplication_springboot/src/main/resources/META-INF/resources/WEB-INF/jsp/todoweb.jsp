<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo page</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div>${name}</div>
		<h1>Welcome to Java Course</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>UserName</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="todo" items="${todolist}">
				<tr>
					 <td>${todo.id}</td>
					 <td>${todo.username}</td>
					 <td>${todo.description}</td>
					 <td>${todo.taretDate}</td>
					 <td>${todo.done}</td>
				 </tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="addtodoweb" class="btn btn-success">Add New Todo</a>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>