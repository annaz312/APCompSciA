//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	public Monster(){
		setWeight(0);
		setHeight(0);
		setAge(0);
	}

	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		setHeight(ht);
		setWeight(0);
		setAge(0);
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		setHeight(ht);
		setWeight(wt);
		setAge(0);
	}

	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}

	
	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht){
		myHeight = ht;
	}
	
	public void setWeight(int wt){
		myWeight = wt;
	}

	public void setAge(int age){
		myAge = age;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return myHeight;
	}
	
	public int getWeight(){
		return myWeight;
	}
	
	public int getAge(){
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	  Monster m = new Monster(); 
	  m.setWeight(myWeight);
	  m.setAge(myAge);
	  m.setHeight(myHeight);
	  
		
		return m;
	}

	public boolean equals( Object obj )
	{
		Monster other = (Monster)obj;
		return myHeight == other.getHeight() && myWeight == other.getWeight() 
				&& myAge == other.getAge();
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		//1 height, 2 weight, 3 age
		if (myHeight > rhs.getHeight())
			return 1;
		else if(myHeight < rhs.getHeight())
			return -1;
		else{
			if (myWeight > rhs.getWeight())
				return 1;
			else if(myWeight < rhs.getWeight())
				return -1;
			else{
				if (myAge > rhs.getAge())
					return 1;
				else if (myAge < rhs.getAge())
					return -1;
				else 
					return 0;
			}
		}
	
	}

	//write a toString() method
	public String toString(){
		return myHeight + " " + myWeight + " " + myAge;
	}
	
	
}