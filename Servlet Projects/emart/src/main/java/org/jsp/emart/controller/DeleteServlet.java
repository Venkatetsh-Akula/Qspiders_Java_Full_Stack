package org.jsp.emart.controller;

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

@WebServlet(urlPatterns="/delete")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		int id=Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emart","root","root");
			PreparedStatement ps=con.prepareStatement("delete from user where id=?");
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			if(row==1) {
				req.setAttribute("rs", con.prepareStatement("select * from user where role='USER'").executeQuery());
				req.getRequestDispatcher("adminhome.jsp").include(req, res);
			}else {
				res.getWriter().write("<html><body><h3>No row had deleted</h3></body></html>");
				req.getRequestDispatcher("adminhome.jsp").include(req, res);
			}
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
