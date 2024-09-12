package org.jsp.project;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
public class DeleteApp {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement s=con.createStatement();
			s.execute("insert into emp values(111,'venky',5000,10)");
			System.out.println(s.getUpdateCount()+" : Row Deleted.....");
			s.close();
			con.close();
			System.out.println("Data Deleted successfully....");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}