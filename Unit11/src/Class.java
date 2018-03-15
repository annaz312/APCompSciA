//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
		
	}
	
	public void sort(){
		Arrays.sort(studentList);
	}
	
	
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double total = 0.0;
		for (int i = 0; i < studentList.length; i++){
			Student temp = studentList[i];
			total = total + temp.getAverage();
		}
		classAverage = total / studentList.length;
		
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		Student student = studentList[stuNum];
		return student.getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		Student student = getStudent(stuName);
		return student.getAverage();
	}
	
	
	public String getStudentName(int stuNum)
	{
		Student student = studentList[stuNum];
		return student.getName();
	}

	public String getStudentWithHighestAverage()
	{
		/*double high = Double.MIN_VALUE;
		Student best = null;
		for (int i = 0; i < studentList.length; i++){
			Student student = studentList[i];
			high = Math.max(high, student.getAverage());
			if (student.getAverage() == high)
				best = student;
		}

		return best.getName();*/
		
		sort();
		return studentList[studentList.length - 1].getName();
	}

	public String getStudentWithLowestAverage()
	{
		
		/*double low = Double.MAX_VALUE;
		Student worst = null; 
		for (int i = 0; i < studentList.length; i++){
			Student student = studentList[i];
			low = Math.min(low, student.getAverage());
			if (student.getAverage() == low){
				worst = student;
			}
		}
		return worst.getName();*/
		
		sort();
		return studentList[0].getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.length; i++){
			if (studentList[i].getAverage() <= failingGrade){
				output = output + studentList[i].getName() + " ";
			}
		}
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for (int i = 0; i < studentList.length; i++){
			output = output + studentList[i] + "\n";
		}
		for (int i = 0; i < studentList.length;i++){
			output = output + studentList[i].getName() + String.format("\'s average = %.2f\n", studentList[i].getAverage()) + "\n" ;
		}
		
		//output = "Failure List = " + this.getFailureList(failingGrade)


		return output;
	}  	
	
	//written by me
	private Student getStudent(String name){
		for (int i = 0; i < studentList.length; i++){
			if (studentList[i].getName().equals(name)){
				return studentList[i];
			}
		}
		return null;
	}
}