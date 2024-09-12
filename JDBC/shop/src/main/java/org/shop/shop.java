package org.shop;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class shop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		double price=sc.nextDouble();
		int quantity=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setDouble(3, price);
			ps.setInt(4, quantity);
			ps.executeUpdate();
			ps.close();
			con.close();
			System.out.println("done");
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}

}

//id 
//name 
//price 
//quantity
