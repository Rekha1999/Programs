package com.acaders.multithreading;

import java.util.Scanner;

class Demo14 extends Thread
{
	public void run() {
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

class Demo15 extends Thread
{
	public void run() {
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
		
	}
}
class Demo16 extends Thread
{
	public void run() {
		System.out.println("Addition has started");
		int x = 100000;
		int y = 900000;
		int z = x+y;
		System.out.println("The value of z is :" +z);
		System.out.println("Addition has ended");					//Though we have extended the threads we didn't get the solution... the program got excetuted one after the other. 
	}
}
public class NeedForExceptionUsingThreads {

	public static void main(String[] args) {
		Demo14 d14 = new Demo14();
		Demo15 d15 = new Demo15();
		Demo16 d16 = new Demo16();
		
		d14.run();
		d15.run();
		d16.run();
		
	}

}
