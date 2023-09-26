package com.acaders.multithreading;

import java.util.Scanner;

class Demo11
{
	static void banking()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking has started");
		System.out.println("Enter Account Number");
		int accno = sc.nextInt();
		System.out.println("Enter the password");
		int pass = sc.nextInt();
		System.out.println("Collect your money");
		System.out.println("Banking has ended");
	}
}

class Demo12
{
	static void printing()
	{
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
		}					
	}
}
class Demo13
{
	static void addition() 
	{
		System.out.println("Addition has started");
		int x = 100000;
		int y = 900000;
		int z = x+y;
		System.out.println("The value of z is :" +z);
		System.out.println("Addition has ended");
	}																	//Though we have written the operation in a separate blocks/methods we are still in a single thread
}
public class NeedForMultiThreadInMethods {

	public static void main(String[] args) 
	{
		Demo11.banking();
		Demo12.printing();
		Demo13.addition();
	}

}
