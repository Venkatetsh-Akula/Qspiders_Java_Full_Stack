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
@WebServlet(urlPatterns="/logindetails")
public class LoginPage extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		String user=req.getParameter("user");
		String password=req.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass_db","root","root");
			PreparedStatement ps=con.prepareStatement("insert into timepass_table values(?,?)");
			ps.setString(1,user);
			ps.setString(2, password);
			int row=ps.executeUpdate();
			if(row==1) {
				ps=con.prepareStatement("select * from timepass_table");
				ResultSet rs=ps.executeQuery();
				req.setAttribute("rs", rs);
				req.getRequestDispatcher("display.jsp").include(req, res);
			}
			else {
				res.getWriter().write("<html><body><h1>No Data found</h1></body></html>");
				req.getRequestDispatcher("display.jsp").include(req, res);
			}
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
	
	}
}
