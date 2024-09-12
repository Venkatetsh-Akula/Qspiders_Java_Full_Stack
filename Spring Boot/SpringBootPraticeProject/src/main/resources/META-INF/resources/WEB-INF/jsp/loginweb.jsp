<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
</head>
<body>

	<form:form modelAttribute="e1" method="post">
		<form:label path="ename">Enter the ename:
			<form:input type="text" path="ename" />
		</form:label>
		<form:label path="deptno">Enter the deptno:
			<form:input type="number" path="deptno"/>
		</form:label>Enter the salary:
		<form:label path="sal">Enter the salary
			<form:input type="number" path="sal"/>
		</form:label>
		<button type="submit">Submit</button>
	</form:form>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
</body>
</html>