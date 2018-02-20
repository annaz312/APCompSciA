//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{


	}

	public Prime(int num)
	{
		setPrime(number);
	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		for (int i = 2; i < number; i++){
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public String toString()
	{
		String output1=number + " is prime.";
		String output2 = number + " is not prime." ;


		if(isPrime()){
			return output1;
		}
		
			return output2;

	}
}