//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;


	public FancyWord()
	{

	}

   public FancyWord(String s)
	{
	  int size = s.length();
	  mat = new char[size][size];
	  
	  char[] line = convertStringToCharArray(s);
	  mat[0] = line;
	  
	  for (int r  = 1; r < size-1; r++){ 
		  for (int i = 0; i < size; i++){
			  //if the index == i or index == length - 1 - i,
			  //add the s.charAt(i) and s.charAt(i - 2)
			  //otherwise, add a space
			  if (i == r){mat[r][i] = s.charAt(i);}
			  else if (i == s.length() - 1 - r){mat[r][i] = s.charAt(s.length() - 1 - r); }
			  else	mat[r][i] = ' ' ;
		  }
	  }
	  mat[size -1] = line;
	  
	   
	}
   
   //written by me
   public char[] convertStringToCharArray(String s){
	   char[] charArray = new char[s.length()];
	   for (int i = 0 ; i < s.length(); i++){
		   charArray[i] = s.charAt(i);
	   }
	   return charArray;
	   
   }
   
   
	public String toString()
	{
		String output="";
		for (int r = 0; r < mat.length; r++){
			for (int i = 0; i < mat[0].length; i++){
				output = output + mat[r][i] + " " ;
				//System.out.print(mat[r][i] + " ");
			}
			//System.out.println();
			output += "\n";
		}




		return output+"\n\n";
	}
}