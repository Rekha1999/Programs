package com.practise.bank;

import java.util.Scanner;

class InvalidAccnoException extends Exception
{

	public String getMessage() {
		return "Wrong Accno has been enterd";
	}
}
class InvalidPasswordException extends Exception
{

	public String getMessage() {
		return "Wrong Password has been enterd";
	}
}
class ATM1
{
	int accno = 1234, password = 1111;
	int accNumber, pass;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the accno");
		accNumber = sc.nextInt();
		System.out.println("Enter the password");
		pass = sc.nextInt();
	}
	void verify() throws InvalidAccnoException, InvalidPasswordException
	{
		if(accno == accNumber)
		{
			if(pass==password)
			{
				collectMoney();
			}
			else
			{
				InvalidPasswordException ipe = new InvalidPasswordException();
				throw ipe;
			}
		}
		else
		{
			InvalidAccnoException iae = new InvalidAccnoException();
			throw iae;
		}
	}

	void collectMoney()
	{
		System.out.println("Money widraw");
	}

}
class Bank1
{
	static ATM atm = new ATM();
	static void permit() {
	try
	{
		atm.input();
		atm.verify();
	}
	catch(Exception e)
	{
		System.out.println("1 chance is over");
		try
		{
			atm.input();
			atm.verify();
		}
		catch(Exception e1)
		{
			System.out.println("2 chance is over");
			try
			{
				atm.input();
				atm.verify();
			}
			catch(Exception e2)
			{
				System.out.println("3 chance is over");
				System.exit(0);
			}
		}
	}
	}
}
public class BankwithException {

	public static void main(String[] args) {
		Bank.permit();
	}

}
