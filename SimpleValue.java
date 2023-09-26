package com.practise.value;

public class SimpleValue {

	public static void main(String[] args)
	{
		int a = 1000;
		System.out.println(a);
		
		int b;													//Pass by value 
		
		b = a;
		System.out.println(b);
		
		b = 2000;
		System.out.println(b);

		
		System.out.println(a);

	}

}
