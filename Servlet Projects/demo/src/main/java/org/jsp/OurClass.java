package org.jsp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
public class OurClass extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException{ 
		System.out.println("hello");
	}
}
