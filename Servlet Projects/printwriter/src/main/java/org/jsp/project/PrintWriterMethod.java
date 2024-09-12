package org.jsp.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/print")
public class PrintWriterMethod extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		String name=req.getParameter("name");
		String location=req.getParameter("location");
		PrintWriter ps=res.getWriter();
		ps.write("<html><body>My name is "+name+" i am from "+location+"</body></html>");
	}
}
