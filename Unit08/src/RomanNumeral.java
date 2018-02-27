//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
		

	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
		
	}

	public void setNumber(Integer num)
	{
		number = num;
		


		int current = getNumber();
		roman = "";
		
		//number to roman
		while (current > 0){
			
		for (int i = 0; i < NUMBERS.length; i++){
				while (NUMBERS[i] <= current){
					current = current - NUMBERS[i];
					roman = roman + LETTERS[i];
				}
			}
		}
		
		
	}

	public void setRoman(String rom)
	{
		roman = rom;
		number=0;
		//outer goes through string
				//inner loop goes through letters, check single or double
				//inner inner loop goes through numbers
				//letter to numb
				String current = "";
				
				for (int i = 0; i < roman.length(); i++){
					for (int j = 0; j < LETTERS.length; j++){
						if (LETTERS[j].length() == 1){
							current = roman.substring(i, i+1);
						}
						else if (i <  roman.length() -1) {
							current = roman.substring(i,i+2);
						} else {
							current = "";
						}
						
						if (current.equals(LETTERS[j])){
							number = number + NUMBERS[j];
							if(LETTERS[j].length() == 2) {
								i++;
							}							
							break;
						}
						
					}
				}
		
		
	}

	public Integer getNumber()
	{
		return number;
	}

	
	public String toString()
	{
		getNumber();
		return roman + "\n";
	}
}