<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="details" method="post">
		<label>Name of the Employee Name:<input  type="text" name="name"></label><br><br>
		<label>Enter the Employee Number:<input type="number" name="idno"></label><br><br>
		<label>Year of Passed out"<input type="number" name="passed"></label><br><br>
		<label>Select Department:
			<select name="key">
				<option value="developer">Java Developer</option>
				<option value="tse">Technical Support Engineering</option>
				<option value="testing">Testing</option>
				<option value="sap">SAP Developer</option>
			</select>
		</label><br><br>
		<label>Enter salary:
			<input type="number" name="sal">
		</label>
		<button type="submit">Submit</button>
	</form>
</body>
</html>