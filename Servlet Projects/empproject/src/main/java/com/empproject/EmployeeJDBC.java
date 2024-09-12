package com.empproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class EmployeeJDBC {
	public static Scanner sc=new Scanner(System.in);
	public static void insert() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement ps=con.prepareStatement("insert into emp values (?,?,?,?)");
			System.out.println("enter the emp no");
			ps.setInt(1, sc.nextInt());
			System.out.println("enter the ename ");
			ps.setString(2, sc.next());
			System.out.println("enter the deptno");
			ps.setInt(3, sc.nextInt());
			System.out.println("enter the sal");
			ps.setInt(4, sc.nextInt());
			int row=ps.executeUpdate();
			System.out.println(row+" are updated");
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void delete() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement ps=con.prepareStatement("delete from emp where empno=?");
			System.out.println("delete the employee based on empno");
			ps.setInt(1, sc.nextInt());
			int row=ps.executeUpdate();
			System.out.println(row+" are updated");
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	public static void update() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement ps=con.prepareStatement("update emp set sal=sal+1000 where empno=?");
			System.out.println("update sal of the employee based on empno incerement 1000");
			ps.setInt(1, sc.nextInt());
			int row=ps.executeUpdate();
			System.out.println(row+" are updated");
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	public static void fetch() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement ps=con.prepareStatement("select * from emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("empno "+rs.getInt(1));
				System.out.println("ename "+rs.getString(2));
				System.out.println("deptno "+rs.getInt(3));
				System.out.println("sal "+rs.getInt(4));
			}
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		while(true) {
			System.out.println();
			System.out.println("enter 0 to exit");
			System.out.println("enter 1 to insert()");
			System.out.println("enter 2 to delete()");
			System.out.println("enter 3 to update()");
			System.out.println("enter 4 to fetch()");
			int op=sc.nextInt();
			if(op==0) {
				break;
			}
			switch(op) {
			case 1:insert();
			break;
			case 2:delete();
			break;
			case 3:update();
			break;
			case 4:fetch();
			break;
			}
		}
	}
}
