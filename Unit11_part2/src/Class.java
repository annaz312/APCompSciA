//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	//private Student[] studentList;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Class()
	{
		name="";
		//studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		//studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		//studentList[stuNum] = s;
		studentList.add(stuNum,s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double total = 0.0;
		for (int i = 0; i < studentList.size(); i++){
			Student temp = studentList.get(i);
			total = total + temp.getAverage();
		}
		classAverage = total / studentList.size();
		
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		Student student = studentList.get(stuNum);
		return student.getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		Student student = getStudent(stuName);
		return student.getAverage();
	}
	
	
	public String getStudentName(int stuNum)
	{
		Student student = studentList.get(stuNum);
		return student.getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		Student best = null;
		for (int i = 0; i < studentList.size(); i++){
			Student student = studentList.get(i);
			high = Math.max(high, student.getAverage());
			if (student.getAverage() == high)
				best = student;
		}

		return best.getName();
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		Student worst = null; 
		for (int i = 0; i < studentList.size(); i++){
			Student student = studentList.get(i);
			low = Math.min(low, student.getAverage());
			if (student.getAverage() == low){
				worst = student;
			}
		}
		return worst.getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() <= failingGrade){
				output = output + studentList.get(i).getName() + " ";
			}
		}
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for (int i = 0; i < studentList.size(); i++){
			output = output + studentList.get(i) + "\n";
		}
		for (int i = 0; i < studentList.size();i++){
			output = output + studentList.get(i).getName() + "\'s average = " + studentList.get(i).getAverage() + "\n" ;
		}
		
		//output = "Failure List = " + this.getFailureList(failingGrade)


		return output;
	}  	
	
	//written by me
	private Student getStudent(String name){
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getName().equals(name)){
				return studentList.get(i);
			}
		}
		return null;
	}
}