package com.alphabet.star;

import java.util.Scanner;

public class AlphabetM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no");
		int n = sc.nextInt();
	
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1 || j==n || i==j && i<=n/2 && i!=1 || i+j==n && i<n/2 && i!=1)
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
