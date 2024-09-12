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

@WebServlet(urlPatterns="/fetch")
public class CheckLoginDetails extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timepassdatabase","root","root");
			PreparedStatement ps=con.prepareStatement("select * from timepasstable where name=? and id=?");
			ps.setString(1, req.getParameter("name"));
			ps.setInt(2, Integer.parseInt(req.getParameter("id")));
			ResultSet rs=ps.executeQuery();
			req.setAttribute("rs",rs);
			req.getRequestDispatcher("Details.jsp").include(req, res);
			rs.close();
			ps.close();
			ps.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
	}
}
