package com.acaders.exception;

import java.util.Scanner;

class Demo2
{
	Scanner sc = new Scanner(System.in);
	void div()throws Exception
	{
		System.out.println("Div has started");
		try
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int res = a/b;
			System.out.println("Result :" +res);
		}
		finally
		{
			System.out.println("Test() completed");
		}
	}
}
public class DuckingException {

	public static void main(String[] args)
	{
		try
		{
			new Demo2().div();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in main()");
		}
		System.out.println("Main is completed");
	}
}





