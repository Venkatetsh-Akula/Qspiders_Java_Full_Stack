package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RufClass extends HttpServlet{
//	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
//	{
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ruf","root","root");
//			PreparedStatement ps=con.prepareStatement("insert into ruf.emp values(?,?,?)");
//			ps.setString(1, req.getParameter("name"));
//			ps.setInt(2, Integer.parseInt(req.getParameter("num")));
//			ps.setInt(3, Integer.parseInt(req.getParameter("dno")));
//			int row=ps.executeUpdate();
//			System.out.println(row +"are updated");
//			ps.close();
//			con.close();
//			PrintWriter pw=res.getWriter();
//			pw.write("<html><body>My full length name "+req.getParameter("name")+" and the  favorouite number is "+req.getParameter("num")+" and my department number is "+req.getParameter("dno")+"</body></html>");
//			}
//		catch (ClassNotFoundException|SQLException e) {
//			e.printStackTrace();
//		}
//	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String name=req.getParameter("name");
		String empno=req.getParameter("num");
		String deptno=req.getParameter("dno");
		PrintWriter ps=res.getWriter();
		ps.write("<html><body>My name is "+name+" my empno is "+empno+" my deptno is "+deptno+" are my details</body></html>");
	}
}
