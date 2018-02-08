//© A+ Computer Science  -  www.apluscompsci.com
//Name - Anna Hong
//Date - 3/6/18
//Class - Period 1
//Lab  - 02e
import java.lang.Math;
public class Circle
{
	private double radius;
	private double area;
	
	
	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea()
	{
		area = (Math.PI * Math.pow(radius,2));
		
	}

	public void print( )
	{
		System.out.println("The area is: " + area);
	}
}