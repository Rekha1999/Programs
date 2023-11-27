import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectSpecificOnEntered {
	public static void main(String[] args) {
		String  url = "jdbc:mysql://localhost:3306/MyDatabase";
		String un = "root";
		String pass = "admin";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, un, pass);
			System.out.println("Connecton established at :" +con);
			String s = "Select * from stud where id = ?";
			PreparedStatement pstmt = con.prepareStatement(s);
			
			System.out.println("Enter the id whose data should be fetched");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();
			pstmt.setString(1, id);
			ResultSet res = pstmt.executeQuery();
			while(res.next()==true) {
				id = res.getString(1);
				String name = res.getString(2);
				String m1 = res.getString(3);
				String m2 = res.getString(4);
				String m3 = res.getString(5);
				System.out.println(id+"   "+name+"   "+m1+"   "+m2+"  "+m3);
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
