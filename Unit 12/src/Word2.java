//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


//copy of Word
public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		setWord(s);
	}
	
	public void setWord(String s){
		word = s;
	}
	
	public String getWord(){
		return word;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		
		int vowelCount=0;
		for (int i = 0 ; i < word.length(); i++){
			for (int k = 0; k < vowels.length(); k++){
				if (vowels.charAt(k) == word.charAt(i))
					vowelCount++;
			}
			
		}
		
		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		
		int wordVowelCount = this.numVowels();
		String obj = rhs.getWord();
		if (wordVowelCount > rhs.numVowels())
			return 1;
		else if (wordVowelCount < rhs.numVowels())
			return -1;
		else{
			for (int i = 0; i < word.length(); i++){
				if (word.charAt(i) < rhs.getWord().charAt(i))
					return -1;
				else if (word.charAt(i) > rhs.getWord().charAt(i))
					return 1;
		}
			return 0;
		}
			
	}
	
	public boolean isGreaterThan(Word2 rhs){
		return this.compareTo(rhs) > 0;
	}
	
	public boolean isLessThan(Word2 rhs){
		return this.compareTo(rhs) < 0;
	}
	
	public boolean equals(Word2 rhs){
		return this.compareTo(rhs) == 0;
	}


	public String toString()
	{
		return this.word;
	}
}