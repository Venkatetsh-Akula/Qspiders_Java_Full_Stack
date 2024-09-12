package org.jsp.timepassproject;

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

@WebServlet(urlPatterns="/delete")
public class DeleteData extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		System.out.println(req);
		String user=req.getParameter("user");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass_db","root","root");
			PreparedStatement ps=con.prepareStatement("delete from timepass_table where user=?");
			ps.setString(1, user);
			int row=ps.executeUpdate();
			if(row==1) {
				ps=con.prepareStatement("select * from timepass_table");
				ResultSet rs=ps.executeQuery();
				req.setAttribute("rs", rs);
				req.getRequestDispatcher("display.jsp").include(req, res);
				res.getWriter().write("<html><body><h1>New Table</h1></body></html>");
			}
			else {
				req.getRequestDispatcher("display.jsp").include(req, res);
				res.getWriter().write("<html><body><h1>No Data found</h1></body></html>");
			}
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
}
