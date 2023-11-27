import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SelectingSpecificData {

	public static void main(String[] args) {
		String  url = "jdbc:mysql://localhost:3306/MyDatabase";
		String un = "root";
		String pass = "admin";

		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, un, pass);
			System.out.println("Connection is established:" +conn);
			String s = "Select * from Stud where id = '2'";   //	 FOR SPECIFIC DATA EXTRACTION*****
			
			java.sql.Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(s);
			while(res.next()==true)
			{
				String id = res.getString(1);
				String name = res.getString(2);
				String m1 = res.getString(3);
				String m2 = res.getString(4);
				String m3 = res.getString(5);
				System.out.println(id+"  "+name+"  "+m1+"  "+m2+"  "+m3);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
