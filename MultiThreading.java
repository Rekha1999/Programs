package com.acaders.multithreading;

import java.util.Scanner;

class Demo21 implements Runnable{

	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking has started");
		System.out.println("Enter the account no");
		int accno = sc.nextInt();
		System.out.println("Enter the password");
		int pwd = sc.nextInt();
		System.out.println("Collect money");
		System.out.println("Banking Completed");

	}
}

class Demo22 implements Runnable
{

	public void run() {
		for(int i=1; i<=3; i++)
		{
			System.out.println("Xyz");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				System.out.println("Exception occured");

			}
		}
	}
}
class Demo23 implements Runnable
{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = sc.nextInt();
		System.out.println("Enter the b value");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("The c is:" +c);
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		Demo21 d21 = new Demo21();
		Demo22 d22 = new Demo22();
		Demo23 d23 = new Demo23();
		
		Thread t1 = new Thread(d21);
		Thread t2 = new Thread(d22);
		Thread t3 = new Thread(d23);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
