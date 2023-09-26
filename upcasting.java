package com.acaders.static1;

class demo{
	void add(float a, float b)
	{
		System.out.println("1st Method");
		System.out.println(a+b);
	}
	void add(float a, int b)
	{
		System.out.println("2nd Method");
		System.out.println(a+b);
	}
}
public class upcasting {

	public static void main(String[] args) 
	{
		int x=10, y=20;
		demo d = new demo();
		d.add(x,y);

	}

}
