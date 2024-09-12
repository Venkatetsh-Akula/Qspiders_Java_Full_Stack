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

@WebServlet(urlPatterns="/update")
public class UpdatePageServletClass extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emart","root","root");
			PreparedStatement ps=con.prepareStatement("select * from user where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				req.setAttribute("rs", rs);
				req.getRequestDispatcher("update.jsp").forward(req, res);
			}else {
				res.getWriter().write("<html><body><h1>No ID found</h1></body></html>");
			}
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
}
