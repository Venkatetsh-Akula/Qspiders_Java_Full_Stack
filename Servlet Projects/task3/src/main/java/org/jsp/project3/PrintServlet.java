package org.jsp.project3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/print")
public class PrintServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException  {
		String name=req.getParameter("name");
		String place=req.getParameter("place");
		PrintWriter pw=res.getWriter();
		pw.write("<html><body><h1>My name is: "+name+" im from "+place+"</h1><body></html>");
	}
}
