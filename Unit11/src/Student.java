//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;

	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);

	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
			Grades grades = new Grades(gradeList);
			myGrades = grades;
		//String to Grade
	}
	
	public Grades getGradeList(){
		return myGrades;
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return myGrades.getSum() / myGrades.getGradeCount(); 		
	}

	public double getAverageMinusLow()
	{
		return (myGrades.getSum() - myGrades.getLowGrade()) / (myGrades.getGradeCount() - 1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}

	@Override
	public int compareTo(Student other){
		if (getAverage() < other.getAverage())
			return -1;
		else if (getAverage() > other.getAverage())
			return 1;
		else 
			return 0;
	}
	
	public boolean equals(Student other){
		if (getAverage() == other.getAverage()){
			return true;
		}
		else 
			return false;
	}
	
	public String toString()
	{
		return this.getName() + " = " + myGrades.toString();
	}	
}