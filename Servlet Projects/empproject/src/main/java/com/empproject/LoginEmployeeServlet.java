package com.empproject;

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

import com.mysql.cj.xdevapi.Result;

@WebServlet(urlPatterns="/login")
public class LoginEmployeeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		try {
			String ename=req.getParameter("name");
			int id=Integer.parseInt(req.getParameter("id"));
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement ps=con.prepareStatement("select * from emp where ename=? and empno=?");
			ps.setString(1, ename);
			ps.setInt(2, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("select * from emp where empno=?");
				ps.setInt(1,id);
				rs=ps.executeQuery();
				req.setAttribute("rs",rs);
				req.getRequestDispatcher("detailsemp.jsp").include(req,res);
			}
			else {
				res.getWriter().write("<html><body><h1>Given Details not found</h1></body></html>");
				req.getRequestDispatcher("detailsemp.jsp").include(req, res);
			}
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
