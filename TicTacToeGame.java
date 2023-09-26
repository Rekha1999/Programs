package com.application.game;

import java.util.Scanner;

class TicTacToe
{
	static void showBoard(char board[][])
	{
		for(int i=0; i<board.length;i++)
		{
			for(int j=0; j<board[i].length;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	static void insert(int pos,char board[][], char sym)
	{
		switch(pos)
		{
			case 1: board[1][1]=sym;
			break;
			case 2: board[1][3]=sym;
			break;
			case 3: board[1][5]=sym;
			break;
			
			case 4: board[3][1]=sym;
			break;
			case 5: board[3][3]=sym;
			break;
			case 6: board[3][5]=sym;
			break;
			
			case 7: board[5][1]=sym;
			break;
			case 8: board[5][3]=sym;
			break;
			case 9: board[5][5]=sym;
			break;
			default: System.out.println("Invalid Position");
		}
	}
	
}

public class TicTacToeGame 
{
	public static void main(String[] args) 
	{
		int player1Pos,player2Pos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Names");
		System.out.print("Player 1 : ");
		String p1 = sc.nextLine();
		System.out.print("Player 2 : ");
		String p2 = sc.nextLine();
		
		char board[][] = {{'_','_','_','_','_','_','_'},
		{'|',' ','|',' ','|',' ','|'},
		{'|','-','+','-','+','-','|'},
		{'|',' ','|',' ','|',' ','|'},
		{'|','-','+','-','+','-','|'},
		{'|',' ','|',' ','|',' ','|'},
		{'-','-','-','-','-','-','-'}};
		TicTacToe.showBoard(board);
		
		while(true)
		{
			System.out.println(p1+": Enter the Position(1-9) to place 'X' ");
			player1Pos = sc.nextInt();
			TicTacToe.insert(player1Pos, board,'X');
			TicTacToe.showBoard(board);
			
			System.out.println(p2+": Enter the Position(1-9) to place 'X' ");
			player2Pos = sc.nextInt();
			TicTacToe.insert(player2Pos, board,'O');
			TicTacToe.showBoard(board);
		}
	}
}









