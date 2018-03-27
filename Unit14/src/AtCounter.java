//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   
   private int rowBound;
   private int columnBound;
   
   
	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{		{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
						
		rowBound = atMat.length;
		columnBound = atMat[0].length;
		
	}

	public int countAts(int r, int c)
	{
		int countAts = 0;
		if (atMat[r][c] == '@'){
			atMat[r][c] = 'v';
			countAts++;
			//marks the spot as visited
	
		if (checkBounds(r+1,c)){countAts = countAts + countAts(r+1,c);}
		if (checkBounds(r-1,c)){countAts = countAts + countAts(r-1,c);}
		if (checkBounds(r,c+1)){countAts = countAts + countAts(r,c+1);}
		if (checkBounds(r,c-1)){countAts = countAts + countAts(r,c-1);}

		}
		
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]

		atCount = countAts;
		return countAts;
	}
	
	//written by me
	public boolean checkBounds(int r, int c){
		if (r < rowBound && r >= 0 && c < columnBound && c >= 0) return true;
		return false;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+= getAtCount()+" @s connected.";
		return output;
	}
}