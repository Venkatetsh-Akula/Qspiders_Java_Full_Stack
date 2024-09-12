package org.jsp.emart.controller;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/create")
public class CreatePageServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		String password=req.getParameter("password");
		String role=req.getParameter("role");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emart","root","root");
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setString(5, role);
			ps.setString(6, password);
			int row=ps.executeUpdate();
			if(row==1) {
				res.getWriter().write("<html><body>Account Create Successfully</body></html>");
				req.getRequestDispatcher("login.jsp").include(req, res);
			}
			else {
				res.getWriter().write("<html><body>SomeThing Wrong</body></html>");
				//req.getRequestDispatcher("login.jsp").include(req, res);
			}
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException| IOException | SQLException e) {
			e.printStackTrace();
		}
	}
}
