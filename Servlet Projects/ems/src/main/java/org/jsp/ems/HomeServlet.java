package org.jsp.ems;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("select * from emp");
		ResultSet rs=ps.executeQuery();
//		if (rs.next()) {
	      req.setAttribute("rs", rs);
	      req.getRequestDispatcher("home.jsp").forward(req, resp);
//		}
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}

	
}
}
