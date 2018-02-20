//� A+ Computer Science  -  www.apluscompsci.com
//Name -Anna Hong
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
		//while the char exists in the sentence, add the character to the blank statement.
		//while (cleaned.indexOf(lookFor) != -1){
			//cleaned = cleaned + sentence.charAt(count);
			//count++;
		
		while (cleaned.indexOf(lookFor) != -1){
		
			cleaned = cleaned.substring(0, cleaned.indexOf(lookFor)) +  
					cleaned.substring(cleaned.indexOf(lookFor) + 1, cleaned.length());	
			count++;
		}


		return cleaned;
	}

	public String toString()
	{
		return removeLetters();
		//return sentence + " - letter to remove " + lookFor + "\n" + this.removeLetters();
	}
}