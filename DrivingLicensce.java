package com.practise.bank;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	public String getMessage() {
		return "You are very yound, So please hold on";
	}
}
class OverAgeException extends Exception
{
	public String getMessage() {
		return "You are very old, So please take rest";
	}
}
class Applicant
{
	Scanner sc = new Scanner(System.in);
	int age;
	void input()
	{
		System.out.println("Applicant, Please enter your age");
		age = sc.nextInt();
	}
	void verify() throws UnderAgeException, OverAgeException
	{
		if(age<18)
		{
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>65)
		{
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("Please collect your DL");
		}
	}
}

class RTO 
{
	void Application()
	{
		Applicant a = new Applicant();
		try
		{
			a.input();
			a.verify();
		}
		catch(Exception e)
		{
			System.out.println("1 chance over");
			try
			{
				a.input();
				a.verify();
			}
			catch(Exception e1)
			{
				System.out.println("2 chance over");
				try
				{
					a.input();
					a.verify();
				}
				catch(Exception e3)
				{
					System.out.println("3 chance over");
					System.exit(0);
				}
			}
		}
	}
}
public class DrivingLicensce {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.Application();
	}

}
