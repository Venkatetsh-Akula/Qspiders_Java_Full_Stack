<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
    String name=(String) session.getAttribute("nm");
    String email=(String) session.getAttribute("em");
   if(name!=null && email!=null)
   {
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        height: 100vh;
    }
    .navbar {
        width: 100%;
        background-color:blue;
        overflow: auto;
    }
    .navbar a {
        float: left;
        padding: 12px;
        color:white;
        text-decoration: none;
        text-align: center;
    }
    .navbar a:hover {
        background-color: #ddd;
        color: black;
    }
    .container {
        width: 80%;
        background-color:window;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        margin-top: 20px;
    }
    h1 {
        text-align: center;
        color: #333;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    table, th, td {
        border: 1px solid #ccc;
    }
    th, td {
        padding: 10px;
        text-align: left;
    }
    th {
        background-color:silver;
    }
   .b1{
   border-radius: 20px;
   background-color:green;
    color: white;
    height: 40px;
    width: 80px;
   }
   .b2{
    border-radius: 20px;
    background-color: red;
    color: white;
    height: 40px;
     width: 80px;
   }
</style>
</head>
<body
>
    <div class="navbar">
        <a href="home">Home</a>
        <a href="create_account.jsp">Add User</a>
        <a href="logout">Logout</a>
    </div>
    <div class="container">
        <h1>Employee Management System</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>email</th>
                    <th>name</th>
                    <th>Salary</th>
                    <th>DeptNo</th>
                    <th>password</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <%
            ResultSet rs=(ResultSet) request.getAttribute("rs");
            while(rs.next()){  	
            %>
            <tbody>
                <tr>
                    <td><%=rs.getInt(1) %></td>
                    <td><%=rs.getString(2) %></td>
                    <td><%=rs.getString(3) %></td>
                    <td><%=rs.getDouble(4) %></td>
                    <td><%=rs.getInt(5)%></td>
                    <td><%=rs.getString(6) %></td>
                    <td>
                        <a href="updatepage?id=<%=rs.getInt(1)%>"><button type="button" class="b1">update</button></a>
                       <a href="delete?id=<%=rs.getInt(1)%>"><button type="button" class="b2">delete</button></a>
                    </td>   
                </tr>
            </tbody>
            <% } %>
        </table>
    </div>
</body>
</html>
<% } 
   else{
	   
	   response.getWriter().write("<html> <body> <h3 style='text-align:center; color: red; text-allign:center;'>Your Session is not </h3> </body> </html>");
	   request.getRequestDispatcher("index.jsp").include(request,response);
	   
   }
%>

