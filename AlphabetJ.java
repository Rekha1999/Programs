package com.alphabet.star;

import java.util.Scanner;

public class AlphabetJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no");
		int n = sc.nextInt();
	
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || j==n/2 && i!=n || i-j==n/2+1 && i==n || j==n/4 && i>3*n/4 && i!=n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
