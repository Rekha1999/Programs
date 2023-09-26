package com.acaders.exception;

import java.util.Scanner;

class Demo
{
	Scanner sc = new Scanner(System.in);
	void div()
	{
		System.out.println("Div has started");
		try
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int res = a/b;
			System.out.println("Result :" +res);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in div()");
			throw e;
		}
		finally 
		{
			System.out.println("Div has completed");	
		}
	}
}

public class ExceptionHandling {

	public static void main(String[] args)
	{
		System.out.println("Main has strated");
		try 
		{
			Demo d = new Demo();
			d.div();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in main()");
		}
		System.out.println("Man has ended");

	}
}