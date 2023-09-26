package com.acaders.exception;

public class TestExceptionDelay {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t);
		try
		{
			t.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("Exception caught");	
		}
		System.out.println("End Program");
	}

}
