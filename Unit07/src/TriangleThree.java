//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return letter;
	}
	
	

	public String toString()
	{
		String output="";
		int count = 0;
		
		
		for(int i = 0; i < size; i++){
			output = output + letter;
			count++;
			
		}
		
		return output;
		
		}
}