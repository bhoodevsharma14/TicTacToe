package com.review;

public class TicTacToe {
	
	static void createNewBoard()
	{
		char[] board=new char[10];
		for(int pos=1;pos<10;pos++)
		{
			board[pos]=' ';
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Tic Tac Toe Game");
		createNewBoard();
	}

}
