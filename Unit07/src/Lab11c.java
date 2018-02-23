//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Lab11c
{
   public static void main( String args[] )
   {
	 
	  int size = 10;
	  String letter = "T";
	   
	  for (int i = 0; i <= size; i++){

		  TriangleThree t = new TriangleThree();
		   t.setTriangle(letter,i);
		   t.getLetter();
		   String str = t.toString();
		   System.out.print(str + "\n");
	  }






	}
}