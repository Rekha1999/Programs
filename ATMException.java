package com.acaders.exception;

import java.util.Scanner;

class InvalidAccnoException extends Exception{

	public String getMessage() {
		return "Wrong Account Number has been Entered";
	}
}
class InvalidPasswordException extends Exception{
	public String getMessage() {
		return "Wrong Password  has been Entered";
	}
}
class ATM {
	int accno =1234, password = 1111;
	int accNumber, pass;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the Account Number");
		accNumber = sc.nextInt();
		System.out.println("Enter the Passwor");
		pass = sc.nextInt();
	}

	void verify() throws InvalidAccnoException,  InvalidPasswordException
	{
		if(accno == accNumber)
		{
			if(pass == password)
			{
				System.out.println("Collect money");
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
		System.out.println("Collect your money");
	}

}
class Bank
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
			System.out.println("1 Chance is over");
			try
			{
				atm.input();
				atm.verify();
			}
			catch(Exception e1)
			{
				System.out.println("2 Chance is over");
				try
				{
					atm.input();
					atm.verify();
				}
				catch(Exception e2)
				{
					System.out.println("3 Chance is over");
					System.out.println("Card is blocked");
					System.exit(0);
				}
			} 
		}
	}

}
public class ATMException {
public static void main(String[] args) {
	Bank.permit();
}
}

