//� A+ Computer Science  -  www.apluscompsci.com
//Name -Anna Hong
//Date -2/09/18
//Class - period 1
//Lab  -04d

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		


	}

	public Name(String s)
	{
		setName(s);


	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		int cut = name.indexOf(' ');
		String first = name.substring(0,cut);
		return first;
	}

	public String getLast()
	{
		int cut = name.indexOf(' ');
		String last  = name.substring(cut+1, name.length());
		return last;
	}

 	public String toString()
 	{
 		return name;
	}
}

