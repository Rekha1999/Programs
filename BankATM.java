package com.practise.bank;

import java.util.Scanner;

class ATM
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
	int verify()
	{
		if(accno == accNumber && password == pass)
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}
	void collectMoney()
	{
		System.out.println("Money widraw");
	}

}
class Bank
{
	static ATM atm = new ATM();
	static void permit()
	{
		atm.input();
		if(atm.verify()!=1)
		{
			System.out.println("1 chance is over");
			atm.input();
			if(atm.verify()!=1)
			{
				System.out.println("2 chance is over");
				atm.input();
				if(atm.verify()!=1)
				{
					System.out.println("3 chance is over");
					System.exit(0);
				}
				else
				{
					atm.collectMoney();
				}
			}
			else
			{
				atm.collectMoney();
			}
		}
		else
		{
			atm.collectMoney();
		}
	}
}
public class BankATM {

	public static void main(String[] args)
	{
		Bank.permit();
	}

}
