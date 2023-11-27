package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Model {
	public List raccnoList = new ArrayList();
	public List amountList = new ArrayList();
	public String accno, name, email, mobileno, pwd, balance;
	String url = "jdbc:mysql://localhost:3306/project", password  = "admin", username = "root";
	Connection con;
	ResultSet res;
	PreparedStatement pmtst;

	public void connect() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

	public int register(String accno, String name, String email, String mobileno, String pass, String balance) {
		try {
			String s = "insert into customer values(?,?,?,?,?,?)";
			pmtst = con.prepareStatement(s);
			pmtst.setString(1, accno);
			pmtst.setString(2, name);
			pmtst.setString(3, email);
			pmtst.setString(4, mobileno);
			pmtst.setString(5, pass);
			pmtst.setString(6, balance);

			int x = pmtst.executeUpdate();
			return x;

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	public int login(String email, String pwd) {
		try {
			String s = "Select * from customer where email =? and password =?";
			pmtst = con.prepareStatement(s);
			pmtst.setString(1, email);
			pmtst.setString(2, pwd);
			res = pmtst.executeQuery();
			while(res.next())
			{
				accno = res.getString("accno");
				name = res.getString("name");
				mobileno = res.getString("mobileno");
				balance = res.getString("balance");

				return 1;
			}
		}
		catch(Exception e)	
		{
			e.printStackTrace();
		}
		return 0;
	}

	public int validAccountno(String raccno) {
		try {
			String s = "select * from customer where accno=?";
			pmtst=con.prepareStatement(s);
			pmtst.setString(1, raccno);
			res = pmtst.executeQuery();
			if(res.next())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	public int transferMoney(String accno, String raccno, String amount) {
		try {
			String s = "Update customer set balance=balance+? where accno=?";
			pmtst = con.prepareStatement(s);
			pmtst.setString(1, amount);
			pmtst.setString(2, raccno);
			pmtst.executeUpdate();

			s = "Update customer set balance=balance-? where accno=?";
			pmtst = con.prepareStatement(s);
			pmtst.setString(1, amount);
			pmtst.setString(2, accno);
			pmtst.executeUpdate();

			s = "insert into statement values(?,?,?)";
			pmtst = con.prepareStatement(s);
			pmtst.setString(1, accno);
			pmtst.setString(2, raccno);
			pmtst.setString(3, amount);
			int x=pmtst.executeUpdate();
			return x;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	public int updatePassword(String accno, String password) {
		try {
			String s ="Update customer password=? where accno=?";
			pmtst = con.prepareStatement(s);
			pmtst.setString(1, password);
			pmtst.setString(2, accno);
			int x = pmtst.executeUpdate();
			return x;

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;


	}

	public void transferHistory(String accno) {
		try {
			String s = "select * from statement where saccno = ?";
			pmtst = con.prepareStatement(s);
			pmtst.setString(1, accno);
			res = pmtst.executeQuery();
			while(res.next())
			{
				raccnoList.add( res.getString("raccno"));
				amountList.add( res.getString("amount"));
			}
			
		}
		catch(Exception e)
		{
			
		}
		
	}

	public int UpdateDetails(String name, String mobileno, String email) {
		try {
			String s = "Update customer set name=?, mobileno=? where email=?";
			pmtst = con.prepareStatement(s);
			pmtst.setString(1, name);
			pmtst.setString(2, mobileno);
			pmtst.setString(3, email);
			int x = pmtst.executeUpdate();
			return x;
		}
		catch(Exception e)
		{
			
		}
		return 0;
		
	}
}
