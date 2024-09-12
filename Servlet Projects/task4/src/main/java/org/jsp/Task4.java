package org.jsp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/details")
public class Task4  extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		String n1=req.getParameter("name");
		String n2=req.getParameter("idno");
		String n3=req.getParameter("passed");
		String n4=req.getParameter("key");
		String n5=req.getParameter("sal");
		PrintWriter pw=res.getWriter();
		pw.write("<html><body><h1>My Name Is "+n1+" My ID_NO Is "+n2+" i passed out year "+n3+ 
				" i am from department of "+n4+" My salary is "+n5+"</h1></body></html>");
	}
}
