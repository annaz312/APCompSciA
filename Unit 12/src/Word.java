//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		setWord(s);
	}
	
	public void setWord(String w){
		word = w;
	}
	
	public String getWord(){
		return word;
	}

	public int compareTo( Word rhs )
	{
		String obj = rhs.getWord();
		if (word.length() > obj.length())
			return 1;
		else if (word.length() < obj.length())
			return -1;
		else {
			for (int i = 0; i < word.length(); i++){
				if (word.charAt(i) < rhs.getWord().charAt(i))
					return -1;
				else if (word.charAt(i) > rhs.getWord().charAt(i))
					return 1;
			}
			return 0;
		}
	}
	
	//written by me
	public boolean isGreaterThan(Word rhs){
		return this.compareTo(rhs) > 0;
	}
	
	public boolean isLessThan(Word rhs){
		return this.compareTo(rhs) < 0;
	}
	
	public boolean equals(Word rhs){
		return this.compareTo(rhs) == 0;
	}

	public String toString()
	{
		return this.word;
	}
}