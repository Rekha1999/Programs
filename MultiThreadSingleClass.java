package com.acaders.multithreading;

import java.util.Scanner;

class Demo25 extends Thread
{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Bank"))
		{
			banking();
		}
		else if(Thread.currentThread().getName().equals("Print"))
		{
			printing();
		}
		else if(Thread.currentThread().getName().equals("Add"))
		{
			addition();
		}
	}

	Scanner sc = new Scanner(System.in);

	public void banking()
	{
		System.out.println("Enter the account number");
		int accountNumber = sc.nextInt();
		System.out.println("Enter the password");
		int password = sc.nextInt();
		System.out.println("Collecct money");
		System.out.println("Banking is completed");
	}
	public void printing()
	{
		System.out.println("Printing has started");
		for(int i = 1; i<=7; i++)
		{
			System.out.println("Hey!!, Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception Occured");
			}
		}
	}
	public void addition()
	{
		System.out.println("Addition starts");
		System.out.println("Enter the a value");
		int a = sc.nextInt();
		System.out.println("Enter the b value");
		int b = sc.nextInt();
		int z = a+b;
		System.out.println("z :" +z);
	}
}
public class MultiThreadSingleClass {

	public static void main(String[] args) {

		Demo25 d00 = new Demo25();
		Demo25 d01 = new Demo25();
		Demo25 d03 = new Demo25();

		d00.setName("Bank");
		d01.setName("Print");
		d03.setName("Add");

		d00.start();
		d01.start();
		d03.start();

	}

}
