package org.jsp;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class NetflixApp {
	public final static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	public static void insert()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/netflix","root","root");
			PreparedStatement ps=con.prepareStatement("insert into netfix values(?,?,?,?)");
			System.out.println("enter movie id");
			ps.setInt(1, sc.nextInt());
			System.out.println("Movie Name");
			ps.setString(2, sc.next());
			System.out.println("Movie year of realse");
			ps.setInt(3, sc.nextInt());
			System.out.println("Hero name");
			ps.setString(4, sc.next());
			System.out.println("Heroine name");
			ps.setString(4, sc.next());
			int row=ps.executeUpdate();
			ps.close();
			con.close();
			System.out.println(row+" : Movie added");
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
}
