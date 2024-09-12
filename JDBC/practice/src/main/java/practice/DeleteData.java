package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ruf_db","root","root");
			PreparedStatement ps=con.prepareStatement("delete from ruf_table where deptno=?");
			ps.setInt(1, sc.nextInt());
			int row=ps.executeUpdate();
			System.out.println(row);
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}