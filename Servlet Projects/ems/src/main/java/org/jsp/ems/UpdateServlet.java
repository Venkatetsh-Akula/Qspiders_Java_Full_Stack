package org.jsp.ems;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id = Integer.valueOf(req.getParameter("id"));
	String email = req.getParameter("email");
	String name = req.getParameter("name");
	Double sal=Double.valueOf(req.getParameter("sal"));
	int deptno= Integer.valueOf(req.getParameter("deptno"));
	String password = req.getParameter("password");

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("update emp set name=?,email=?,sal=?,deptno=?,password=? where id=?");
		
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setDouble(3, sal);
		ps.setInt(4, deptno);
		ps.setString(5, password);
		ps.setInt(6, id);
		int row=ps.executeUpdate();
		if (row==1) {
			req.setAttribute("rs", con.prepareStatement("select * from emp").executeQuery());
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
