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
			
		sc.close();
		

	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] board=createNewBoard();
		playerCharacter();
		
	}

}
