package org.jsp.ems;

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

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int id=Integer.valueOf(req.getParameter("id"));
System.out.println(id);


try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
	PreparedStatement ps = con.prepareStatement("delete from emp where id=?");
	ps.setInt(1, id);
	int row=ps.executeUpdate();
	if (row==1) {
		ps=con.prepareStatement("select * from emp");
		req.setAttribute("rs", ps.executeQuery());
		req.getRequestDispatcher("home.jsp").include(req, resp);
	}
	
	ps.close();
	con.close();
	System.out.println(row +" : employeee deleted with id : "+id);
	}
catch (ClassNotFoundException | SQLException e) {
	
	e.printStackTrace();
}

}
}
