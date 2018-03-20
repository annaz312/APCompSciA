//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] list = new Word[size];
		
		int index = 0;
		while (file.hasNextLine()){
			//creates unsorted list to get passed into sortWords();
			String nextString = file.nextLine();
			Word nextWord = new Word(nextString);
			list[index++] = nextWord;
		}

		sortWords(list);
		
	}
	
	public static ArrayList<Word> sortWords(Word[] words){
		ArrayList<Word> sorted = new ArrayList<Word>();
		sorted.add(words[0]);
		for (int i = 1; i < words.length; i++){
			Word word = words[i];
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