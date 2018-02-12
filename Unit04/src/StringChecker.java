//� A+ Computer Science  -  www.apluscompsci.com
//Name -Anna Hong
//Date -2/09/18
//Class - period 1
//Lab  -04e

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{
		setString(s);

	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		for (int i = 0; i <= word.length(); i++) {
			if (word.charAt(i) == c) 
				return true;
		}

		return false;
	}

	public boolean findSubString(String s)
	{
		for (int i = 0; i <= word.length()-s.length(); i++) {
			if (word.substring(i, i+s.length()).equals(s))
				return true;
		}

		return false;
	}

 	public String toString()
 	{
 		return word;
	}
}