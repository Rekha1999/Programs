import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertingData {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/MyDatabase";
		String un = "root";
		String pass = "admin";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, un, pass);
			System.out.println("Connection Established :"+con);
			String s = "insert into Stud values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(s);
			System.out.println("Enter the ID");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();

			System.out.println("Enetr the name");
			String name = sc.nextLine();

			System.out.println("Enter the marks1");
			String m1 = sc.nextLine();

			System.out.println("Enter the marks2");
			String m2 = sc.nextLine();

			System.out.println("Enter the marks3");
			String m3 = sc.nextLine();

			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, m1);
			pstmt.setString(4, m2);
			pstmt.setString(5, m3);
			
			
			int x = pstmt.executeUpdate();
			if(x!=0)
			{
				System.out.println("Data Inserted");
			}
			else
			{
				System.out.println("It failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
