package org.jsp.emart.controller;

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

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emart","root","root");
			PreparedStatement ps=con.prepareStatement("select * from user where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				if(rs.getString(5).equals("ADMIN")) {
					ps=con.prepareStatement("select * from user where role='USER'");
					rs=ps.executeQuery();
					req.setAttribute("rs",rs);
					req.getRequestDispatcher("adminhome.jsp").include(req, res);
				}else if(rs.getString(5).equals("USER")) {
					req.getRequestDispatcher("home.jsp").include(req, res);
				}
			}
			else {
				res.getWriter().write("<html><body><h3>Invalid Credentals</h3></body></html>");
				req.getRequestDispatcher("login.jsp").include(req, res);
			}
			rs.close();
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
