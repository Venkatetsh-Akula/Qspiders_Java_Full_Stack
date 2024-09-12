package org.jsp.project3;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.Servlet;
public class Task3 extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		System.out.println(req.getParameter("n1"));
		System.out.println(req.getParameter("n2"));
		System.out.println(req.getParameter("n3"));
	}
}