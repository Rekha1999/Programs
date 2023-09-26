package com.hotel.project;

import java.util.Scanner;

public class HotelProject {

	public static void main(String[] args)
	{
		int srlno, quantity;
		String itemName = " ";
		Float cost = 0.0f, subTotal = 0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("__________________________\n"
				+"|       M  E  N  U       |\n"
				+"|________________________|\n"
				+"|srlno    Item       Cost|\n"
				+"|________________________|\n"
				+"|1        Idly         20|\n"
				+"|2        Dosa         50|\n"
				+"|3        Poori        40|\n"
				+"|4        Vada         45|\n"
				+"|5        Coffee       30|\n"
				+"|6        Water        20|\n"
				+"|________________________|\n"
				+"|________________________|");
		System.out.println("Enter the item of your choice: ");
		srlno = sc.nextInt();
		System.out.println("Enter the quantity");
		quantity = sc.nextInt();
		
		switch(srlno)
		{
		case 1: itemName = "Idly";
			cost = 20.0f;
			subTotal = cost*quantity;
			break;
		case 2: itemName = "Dosa";
		cost = 50.0f;
		subTotal = cost*quantity;
		break;
		case 3: itemName = "Poori";
		cost = 40.0f;
		subTotal = cost*quantity;
		break;
		case 4: itemName = "Vada";
		cost = 45.0f;
		subTotal = cost*quantity;
		break;
		case 5: itemName = "Coffee";
		cost = 30.0f;
		subTotal = cost*quantity;
		break;
		case 6: itemName = "Water";
		cost = 20.0f;
		subTotal = cost*quantity;
		break;
		default: System.out.println("You have entered worng no");
		
			
		}
		
		System.out.println(itemName+"  "+cost+"  "+quantity+"  "+subTotal);

	}

}
