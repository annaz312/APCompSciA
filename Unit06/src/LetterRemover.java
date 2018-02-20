//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	public LetterRemover(String str){
		
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int count = 0;
		String cleaned=sentence;
		//while (cleaned.indexOf(lookFor) != -1){
		while (count <= 15){
			cleaned = cleaned.substring(0, lookFor) + cleaned.substring(lookFor+1,cleaned.length());
			count++;
		}





		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}