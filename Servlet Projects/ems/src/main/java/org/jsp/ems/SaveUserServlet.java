package org.jsp.ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/save_user")
public class SaveUserServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.valueOf(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		String password = req.getParameter("password");
		String cpassword = req.getParameter("cpassword");
		
		
		
		PrintWriter pw=resp.getWriter();
		if (!password.equals(cpassword)) {
			pw.write("<html><body style='text-align:center;color:red;'><h3>conform password mismatched check it once </h3></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("create_account.jsp");
			rd.include(req, resp);
		}
		else {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop", "root", "root");
				PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, email);
				ps.setLong(4, phone);
				ps.setString(5, password);
				int row = ps.executeUpdate();
				ps.close();
				con.close();
				System.out.println(row + " :is affected.....");
				System.out.println("data inserted successfully...");
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

			pw.write("<html><body><h3>" + name + " :your account has been created successfully </h3></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.include(req, resp);
		}
	}
}
