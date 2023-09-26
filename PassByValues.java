package com.practise.value;

class Demo3{
	int num;
	Demo3(int x)
	{
		num = x;
	}
	Demo3()
	{
		num = 0;
	}
}
public class PassByValues {

	public static void main(String[] args) 
	{
		Demo3 d3 = new Demo3();
		Demo4(d3);
		System.out.println(d3.num);

	}

	private static void Demo4(Demo3 d3) 
	{
		d3.num = 50;		
	}

}
