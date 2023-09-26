package com.acaders.multithreading;

import java.util.Scanner;

public class NeedForMultiThread {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Banking
		System.out.println("Banking has started");
		System.out.println("Enter Account Number");
		int accno = sc.nextInt();
		System.out.println("Enter the password");
		int pass = sc.nextInt();
		System.out.println("Collect your money");
		System.out.println("Banking has ended");
		
		//Printing 
		System.out.println("Printing has started");
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Some exception occured");
			}
		}															//This is the common program which does not solve the speed od executing the program...
		System.out.println("Printing has ended");
		
		//addition 
		System.out.println("Addition has started");
		int x = 100000;
		int y = 900000;
		int z = x+y;
		System.out.println("The value of z is :" +z);
		System.out.println("Addition has ended");
	}

}
