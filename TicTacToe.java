package com.review;
import java.util.*;
public class TicTacToe {
	
	static char PLAYER,COMPUTER;
	
	static char[] createNewBoard()
	{
		char[] new_board=new char[10];
		for(int pos=1;pos<10;pos++)
		{
			new_board[pos]=' ';
		}
		
		return new_board;
	}
	
	static void playerCharacter()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Select A character 'X' or 'O' : ");
		
		PLAYER=sc.next().toUpperCase().charAt(0);
		
			
		if(PLAYER=='X')
			COMPUTER='O';
		else if(PLAYER=='O')
			COMPUTER='X';
		else
			{
				System.out.println("Please Enter a Valid Character");
				PLAYER=' ';
			}
			
//		sc.close();
		

	}
	
	static void displayBoard(char[] board)
	{	int horizontal=0;
		for(int pos=1;pos<10;pos++)
		{
			System.out.print(board[pos]);
			
			if(pos%3==0)
			{
				horizontal++;
				if(horizontal>2)
					System.out.println();
				else
					System.out.print("\n_ _ _\n");
			}
			else
				System.out.print("|");
		}
	}
	
	static char[] playerMove(char[] board)
	{
		
			
			System.out.println("Please Enter A Position Where You Want To Move from 1-9 : ");
			Scanner scan=new Scanner(System.in);
			
			int movePosition;
			
			movePosition=scan.nextInt();
			
			if(movePosition<1 || movePosition>9 )
				System.out.println("You Entered A INVALID MOVE!!! ");
			else if(board[movePosition]==' ')
				board[movePosition]=PLAYER;
			else
				System.out.println("Position In Already Taken!!!");
			
			
		
		return board;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] board=createNewBoard();
		playerCharacter();
		displayBoard(board);
		board=playerMove(board);
		displayBoard(board);
	}

}
