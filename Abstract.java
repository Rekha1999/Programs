package com.abstractPrograms.practise;

abstract class Demo1
{
	abstract void disp1();
	abstract void disp2();
}

abstract class Demo2 extends Demo1
{
	void disp1()
	{
		System.out.println("This is disp1 method");
	}
}
class Demo3 extends Demo2
{
	void disp2()
	{
		System.out.println("This is disp2 method");
	}
}
public class Abstract 
{

	public static void main(String[] args) 
	{
		Demo3 d3 = new Demo3();
		d3.disp1();
		d3.disp2();
		
	}

}
