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

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	
	public MadLib()
	{
	}

	
	public MadLib(String fileName)
	{
		
		try{
			Scanner file = new Scanner(new File(fileName));
			
			loadNouns();
			loadAdjectives();
			loadVerbs();
			
			String template = file.nextLine();
			
			Scanner chopper = new Scanner(template);
			while(chopper.hasNext()){
				String word = chopper.next();
				if (word.equals("#")){
					word = getRandomNoun();
				}
				else if (word.equals("&")){
					word = getRandomAdjective();
				}
				else if (word.equals("@")){
					word = getRandomVerb();
				}
				
				story = story + " " + word;
			}
			
			
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		Scanner file = new Scanner(new File("/Users/anna/git/APCompSciA/Unit10/nouns.dat"));
		while(file.hasNext()){
			nouns.add(file.next());
		}
		
		file.close();
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("/Users/anna/git/APCompSciA/Unit10/verbs.dat"));
			while(file.hasNext()){
				verbs.add(file.next());
			}
			file.close();
					
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("/Users/anna/git/APCompSciA/Unit10/adjectives.dat"));
			while(file.hasNext()){
				adjectives.add(file.next());
			}
	
	
			file.close();
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		int size = verbs.size();
		int randomInt = (int) (Math.random() * size);
	
		return verbs.get(randomInt);
	}
	
	public String getRandomNoun()
	{
		int size = nouns.size();
		int randomInt = (int) (Math.random() * size);
		return nouns.get(randomInt);
	}
	
	public String getRandomAdjective()
	{
		int size = adjectives.size();
		int randomInt = (int) (Math.random() * size);
		return adjectives.get(randomInt);
	}		

	public String toString()
	{
	   return story;
	}
}