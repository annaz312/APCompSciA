//� A+ Computer Science  -  www.apluscompsci.com
//Name -Anna Hong
//Date - 2/14/18
//Class - period 1
//Lab  -08g

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats l = new LoopStats(5,15);
		l.setNums(5,15);
		
		out.println(l.toString());
		out.println("total " + l.getTotal());
		out.println("even count "+ l.getEvenCount());
		out.println("odd count " + l.getOddCount());
		
					
	}
}