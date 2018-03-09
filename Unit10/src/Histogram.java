//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
	

	public Histogram()
	{

	}

	public Histogram(char[] values, String fName)
	{
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
		fileName = fName;
		for (int i = 0; i < values.length; i++){
			letters.add(new Character(values[i]));
			count.add(new Integer(0));
		}


		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{	
		char c;
		String line;
		int value;
		try {
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine()){
				line = file.nextLine();
				
				for (int i = 0; i < line.length(); i++){
					c = line.charAt(i);
					//scanned the character
					for (int k = 0; k < letters.size(); k++){
						//check to see if the character == the array
						if (letters.get(k).equals(c)){
							//add count to new array
							value = count.get(k) + 1;
							count.set(k, value);

						}
					}
				}
				
			}
			
			file.close();
			
		} 
		catch(Exception e){
			
		}
		
		


	}

	public char mostFrequent()
	{
		int max = 0;
		char output = 0;
		for (int i = 0; i < count.size(); i++){
			max = Math.max(max, count.get(i));
		}
		output = letters.get(count.indexOf(max));
		
		return output;
	}

	public char leastFrequent()
	{
		int min = Math.min(count.get(0), count.get(1));
		for (int i = 0; i < count.size(); i++){
			min = Math.min(min, count.get(i));
		}

		return letters.get(count.indexOf(min));
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}