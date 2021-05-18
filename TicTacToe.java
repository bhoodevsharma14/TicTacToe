package com.review;

public class TicTacToe {
	
	static char[] createNewBoard()
	{
		char[] new_board=new char[10];
		for(int pos=1;pos<10;pos++)
		{
			new_board[pos]=' ';
		}
		
		return new_board;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] board=createNewBoard();
	}

}
