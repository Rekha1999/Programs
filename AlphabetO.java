package com.alphabet.star;

import java.util.Scanner;

public class AlphabetO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no");
		int n = sc.nextInt();
	
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 && j!=1 && j!=n || i==n && j!=1 && j!=n || j==1 && i!=1 && i!=n || j==n && i!=n && i!=1)
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
