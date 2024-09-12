package org.jsp.project3;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.GenericServlet;
@WebServlet("/add")
public class AddServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse res) {
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		System.out.println(Integer.parseInt(n1)+Integer.parseInt(n2));
	}
}
