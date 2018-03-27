//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat = setCharArray(game);
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat[0].length; j++){
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		getWinner();
	}

	public String getWinner()
	{
		for (int i = 0; i < 3; i++){
			if (mat[i][0] == mat[i][1] && mat[i][1] == mat[i][2]){
				return mat[i][0] + " wins horizontally!";
			}
		}
		
		for (int i = 0; i < 3; i++){
			if (mat[0][i] == mat[1][i] && mat[1][i] == mat[2][i]){
				return mat[0][i] + " wins vertically!";
			}
		}
		//check diagonals
		if ((mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]) || 
				(mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2])){
			return mat[1][1] + " wins diagonally!" ;
		}
		
		
		
		
		return "cat's game - no winner!";
	}
	
	//written by me
	public char[][] setCharArray(String line){

		char[] column;
		char[][] mat = new char[3][3];
		
		int index = 0;
		for (int i = 0; i < 3; i++){
			column = new char[3];
			for (int j = 0; j < 3; j++){
				column[j] = line.charAt(index++);
			}
			mat[i] = column; 
		}
		
		return mat;
	}

	public String toString()
	{
		String output= getWinner();

		return output+"\n\n";
	}
}