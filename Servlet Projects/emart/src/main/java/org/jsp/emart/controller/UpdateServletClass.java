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

@WebServlet(urlPatterns="/updatedata")
public class UpdateServletClass extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		String role=req.getParameter("role");
		String password=req.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emart","root","root");
			PreparedStatement ps=con.prepareStatement("update user set name=?,email=?,phone=?,role=?,password=? where id=?");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setLong(3, phone);
			ps.setString(4, role);
			ps.setString(5, password);
			ps.setInt(6, id);
			int row=ps.executeUpdate();
			if(row==1) {
				res.getWriter().write("<html><body><h2 id='abc'>User Updated Successfully</h2></body></html>");
				req.setAttribute("rs", con.prepareStatement("select * from user where role='USER'").executeQuery());
				req.getRequestDispatcher("adminhome.jsp").include(req, res);
			}
			else {
				req.getRequestDispatcher("adminhome.jsp").include(req, res);
			}
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
}
