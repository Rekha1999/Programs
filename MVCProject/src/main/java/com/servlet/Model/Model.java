package com.servlet.Model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model {
	private String id, name, m1, m2, m3;
	String url, un, pass;
	Connection con;
	PreparedStatement ptmt;

	public void connect() {
		try {
			url = "jdbc:mysql://localhost:3306/MyDatabase";
			un = "root";
			pass = "admin";												//Connect to the database
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, un, pass);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void fetchData() {
		try {
			String s = "select * from stud where id=?";
			ptmt = con.prepareStatement(s);
			ptmt.setString(1, id);
			ResultSet res = ptmt.executeQuery();
			while(res.next()==true)
			{
				id = res.getString(1);
				name = res.getString(2);
				m1 = res.getString(3);
				m2 = res.getString(4);
				m3 = res.getString(5);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public int updateData() {
		try {
			String s = "Update stud set marks2 = ? where id = ?";
			ptmt = con.prepareCall(s);
			ptmt.setString(1, m2);	
			ptmt.setString(2, id);
			int x = ptmt.executeUpdate();
			return x;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	public int insertData() {
		try {
			String s = "insert into stud values(?,?,?,?,?)";
			con.prepareStatement(s);
			ptmt.setString(1, id);
			ptmt.setString(2, name);
			ptmt.setString(3, m1);
			ptmt.setString(4, m2);
			ptmt.setString(5, m3);
			int y = ptmt.executeUpdate();
			return y;

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getM1() {
		return m1;
	}

	public void setM1(String m1) {
		this.m1 = m1;
	}

	public String getM2() {
		return m2;
	}

	public void setM2(String m2) {
		this.m2 = m2;
	}

	public String getM3() {
		return m3;
	}

	public void setM3(String m3) {
		this.m3 = m3;
	}

	

	

}
