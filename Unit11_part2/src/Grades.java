
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

public class Grades {
	//private double[] grades;
	private ArrayList<Double> grades = new ArrayList<Double>();

	public Grades() {
	}

	public Grades(String gradeList) {
		setGrades(gradeList);
		
	}

	public void setGrades(String gradeList) {
		Scanner chopper = new Scanner(gradeList);
		int number = chopper.nextInt();
		chopper.next();
	//	grades = new double[number];
		
		int count = 0;
		while (chopper.hasNextDouble()){
			double value = chopper.nextDouble();
			grades.add(value);
			// setGrade(count++, value);

		}
			
			
		
	}

	public void setGrade(int spot, double grade) {
		// check
	//	grades[spot] = grade;
		grades.set(spot, grade);
	}

	public double getSum() {
		double sum = 0.0;
		for (int i = 0; i < grades.size(); i++) {
			sum = sum + grades.get(i);
		}

		return sum;
	}

	public double getLowGrade() {
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.size(); i++){
			low = Math.min(low, grades.get(i));
		}

		return low;
	}

	public double getHighGrade() {
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.size(); i++){
			high = Math.max(high, grades.get(i));
		}

		return high;
	}

	public int getNumGrades() {
		return grades.size();
	}

	public String toString() {
		String output = "";

		for (int i = 0; i < grades.size(); i++){
			output = output + grades.get(i);
			if (i < grades.size() - 1){
				output = output + " ";
			}
		}
		
		return output;
	}
	
	//written by me
	public int getGradeCount(){
		return grades.size();
	}
	
}