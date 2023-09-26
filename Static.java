package com.acaders.static1;

class Demo1{
	int a,b;

	Demo1()
	{
		a=10;
		b=20;
	}
	Demo1(int x)
	{
		a=x;
		b=x*x;
	}
	Demo1(int x, int y)
	{
		a=x;
		b=y;
	}
	Demo1(int x,int y, int z)
	{
		a=x+y-z;
		b=x+y+z;
	}
	String disp()
	{
		return a+"   "+b;
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		System.out.println(d.disp());
		
		Demo1 d1 = new Demo1(20);
		System.out.println(d1.disp());
		
		Demo1 d2 = new Demo1(20,30);
		System.out.println(d2.disp());
		
		Demo1 d3 = new Demo1(20,30,40);
		System.out.println(d3.disp());
		

	}

}
