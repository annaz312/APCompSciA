//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18e.dat"));
		
		int size = file.nextInt();
		Word2[] unsortedWords = new Word2[size];
		file.nextLine();
		
		int index = 0;
		while (file.hasNextLine()){
			String nextString = file.nextLine();
			Word2 nextWord = new Word2(nextString);
			unsortedWords[index++] = nextWord;
			
		}
		
		sortWords(unsortedWords);

	}
	
	public static ArrayList<Word2> sortWords(Word2[] words){
		ArrayList<Word2> sorted = new ArrayList<Word2>();
		sorted.add(words[0]);
		for (int i = 1; i < words.length; i++){

			Word2 word = words[i];
			boolean added = false;
			for (int k = 0; k < sorted.size(); k++){
		
				if (word.isLessThan(sorted.get(k))){
					sorted.add(k,word);
					added = true;
					break;
				}
				else if (word.equals(sorted.get(k))){
					sorted.add(k,word);
					added = true;
					break;
				}			
			}
			if (!added)
				sorted.add(word);		
		}
		
		for (int i = 0 ; i < sorted.size(); i++){
			System.out.println(sorted.get(i));
		}
		
		return sorted;
	}
	
	
}