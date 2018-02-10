//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		


	}

	public StringChecker(String s)
	{


	}

   public void setString(String s)
   {
	   word=s;
   }

	public boolean findLetter(char c)
	{

		for(int i = 0;i<word.length();i++ ){
			if (word.charAt(i).equals('c')) {return true;}
			
			else return false;
						
						
		}
			


		return false;
	}

	public boolean findSubString(String s)
	{



		return false;
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}