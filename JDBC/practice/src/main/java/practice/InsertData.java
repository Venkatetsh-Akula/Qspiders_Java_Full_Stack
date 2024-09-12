package practice;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class InsertData{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_table","root","root");
			PreparedStatement ps=con.prepareStatement("insert into ruf_table values(?,?,?,?)");
			ps.setInt(1, sc.nextInt());
			ps.setString(2,sc.next());
			ps.setInt(3, sc.nextInt());
			ps.setLong(4,sc.nextInt());
			int row=ps.executeUpdate();
			System.out.println(row+" had updated");
			ps.close();
			con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
}
