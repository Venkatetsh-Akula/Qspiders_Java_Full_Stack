package org.jsp.timepass;
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
@WebServlet(urlPatterns ="/timepass")
public class CreateAccount extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timepassdatabase","root","root");
			PreparedStatement ps=con.prepareStatement("insert into timepasstable values(?,?,?)");
			ps.setInt(1, Integer.parseInt(req.getParameter("id")));
			ps.setString(2, req.getParameter("name"));
			ps.setLong(3, Long.parseLong(req.getParameter("phone")));
			int row=ps.executeUpdate();
			System.out.println(row +" are afftected");
			if(row==1) {
				ps=con.prepareStatement("select * from timepasstable");
				ResultSet rs=ps.executeQuery();
				req.setAttribute("rs", rs);
				req.getRequestDispatcher("Details.jsp").include(req, res);
				res.getWriter().write("<html><body><h1>Tata Bye Bye</h1></body></html>");
			}
			else {
				res.getWriter().write("<html><body><h1>No creating no insertion are allowed</h1></body></html>");
			}
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
