<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN Home Page</title>
<style>
ul{
	list-style-type:none;
	display:flex;
}
ul li{
	padding:5px 5px;
}

table{
	margin:auto;
}
</style>
</head>
<body>
	<header>
		<h1>ADMIN Home Page</h1>
		
		<ul>
			<li><a href="#">Users</a></li>
			<li><a href="create.jsp">Create Users</a></li>
			<li><a href="#">Create Product</a></li>
			<li><a href="#">Product</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Contact</a></li>
			<li><a href="#">LogOut</a></li>
		</ul>
	</header>
	<table cellspacing="0" cellpadding="10" border="5">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Role</th>
			<th>Password</th>
			<th colspan=2>Action</th>
		</tr>	
	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	while (rs.next()) {
	%>
		<tr>
			<td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getLong(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString(6) %></td>
			<td><a href="delete?id=<%=rs.getInt(1)%>"><button>Delete</button></a></td>
			<td><a href="update?id=<%=rs.getInt(1)%>"><button>Update</button></a></td>
		</tr>
	
	<%
	}
	%>
	</table>
	
	<script type="text/javascript">
		let abc=document.getElementById("abc");
		if(abc){
			setTimeout(()=>{
				abc.style.display="none"
			},2000);
		}
	</script>
</body>
</html>