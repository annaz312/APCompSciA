//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound;
   private int rowBound;
   private int columnBound;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		
		int[] nums = new int[line.length()];
		maze = new int[size][size];
		
		Scanner chopper = new Scanner(line);
		for (int i = 0; i < line.length(); i+=2){
		
			int num = line.charAt(i) - '0';		
		
			nums[i/2]  = num;
		}

		
		int index =0;
		for (int i = 0; i < size; i++){
			//rows
			int[] columns = new int[size];
			for (int j = 0; j < size; j++){
				//columns
				columns[j] = nums[index++];
					
			}
			
			maze[i] = columns;
		}
					
		exitFound = false;
		rowBound = maze.length;
		columnBound = maze[0].length;
		
		
		for (int i = 0; i < maze.length; i++){
			System.out.println();
			for (int j = 0; j < maze[0].length; j++){
				System.out.print(maze[i][j] + " ");
			}
		}
	}

	public boolean hasExitPath(int r, int c)
	{
		
		if(c == 9) { 
		
			
		}
		
		if((c == columnBound-1) && maze[r][c] == 1){
			exitFound = true;
			
			return true;
		}
		
		maze[r][c] = 0;
	
		if ( checkBounds(r+1,c) && maze[r+1][c] == 1) {
			hasExitPath(r+1,c);
		}
		if (checkBounds(r-1,c) && maze[r-1][c] == 1) {
			hasExitPath(r-1,c);
		}
		if (checkBounds(r,c+1) && maze[r][c+1] == 1){
			hasExitPath(r,c+1);
		}
		if (checkBounds(r,c-1) && maze[r][c-1] == 1) {
			hasExitPath(r,c-1);
		}
		return false;
	}
	
	//written by me
	public boolean checkBounds(int r, int c){
		
		
		if (r < rowBound && r >= 0 && c < columnBound && c >= 0)
			{
			return true;}
	
		return false;
	}
	

	public String toString()
	{
		if (exitFound) return "exit found";
		else return "exit not found";
	}
}