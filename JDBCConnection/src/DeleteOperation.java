import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteOperation {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/MyDatabase";
		String un = "root";
		String pass = "admin";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, un, pass);
			System.out.println("Connection Established :"+con);
			String s = "Delete from stud where id = ?";
			PreparedStatement pstmt = con.prepareStatement(s);
			
			System.out.println("Enter the ID");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();

			pstmt.setString(1, id);			
			
			int x = pstmt.executeUpdate();
			if(x!=0)
			{
				System.out.println("Data Deleted");
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
