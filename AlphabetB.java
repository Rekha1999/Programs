package com.alphabet.star;

import java.util.Scanner;

public class AlphabetB {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number");
			int n = sc.nextInt();
			
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=n; j++)
				{
					if(i==1 && j<3*n/4 || i==n/2 && j!=n || j==1 || i==n && j!=n || 
							i>n/2 && j==n && i!=n || j==3*n/4 && i!=1 && i<n/2)
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