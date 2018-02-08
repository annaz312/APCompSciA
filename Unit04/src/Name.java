//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{


	}

	public Name(String s)
	{

		//?? I don't know what to put here.
	}

   public void setName(String s)
   {
	   name = s;
	   
   }

	public String getFirst()
	{
		//get index of space
		//substring(0,index of space)
		//substring(index of space + 1, str.length()+1
		
		int space = name.indexOf(' ');
		String first = name.substring(0, space);
	
		
		return first;
	}

	public String getLast()
	{
		return "";
	}

 	public String toString()
 	{
 		return "";
	}
}