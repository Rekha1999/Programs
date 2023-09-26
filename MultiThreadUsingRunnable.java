package com.acaders.multithreading;

import java.util.Scanner;

class Demo17 implements Runnable 
{
	Scanner sc = new Scanner(System.in);
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
class Demo18 implements Runnable
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
class Demo19 implements Runnable
{

	public void run() {
		System.out.println("Addition has started");
		int x = 100000;
		int y = 900000;
		int z = x+y;
		System.out.println("The value of z is :" +z);
		System.out.println("Addition has ended");				
	}
}

public class MultiThreadUsingRunnable {

	public static void main(String[] args) {
		Demo17 d17 = new Demo17();
		Demo18 d18 = new Demo18();
		Demo19 d19 = new Demo19();
															//Using runnable interface 
		Thread t1 = new Thread(d17);
		Thread t2 = new Thread(d18);
		Thread t3 = new Thread(d19);

		t1.start();
		t2.start();
		t3.start();
	}

}
