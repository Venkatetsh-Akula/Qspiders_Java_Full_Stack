package com.empproject;

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

@WebServlet(urlPatterns ="/delete")
public class DeleteEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		int empno=Integer.parseInt(req.getParameter("empno"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement ps=con.prepareStatement("delete from emp where empno=?");
			ps.setInt(1, empno);
			int row=ps.executeUpdate();
			if(row==1) {
				res.getWriter().write("<html><body><h1>One Row Details had deleted</h1></body></html>");
				req.getRequestDispatcher("loginemp.jsp").include(req, res);
			}
			else {
				res.getWriter().write("<html><body><h1>No Row Details had deleted</h1></body></html>");
				req.getRequestDispatcher("loginemp.jsp").include(req, res);
			}
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
}
