package org.jsp.project2;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Task2 extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println(" Overriden service() in PersonServelt class...............");
		System.out.println(req.getParameter("p1"));
		System.out.println(req.getParameter("p2"));
		System.out.println(req.getParameter("p3"));
		
	}

}
