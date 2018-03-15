
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades {
	private double[] grades;
	// store an array of grade? or an array of double?

	public Grades() {
	}

	public Grades(String gradeList) {
		setGrades(gradeList);
		
	}

	public void setGrades(String gradeList) {
		Scanner chopper = new Scanner(gradeList);
		int number = chopper.nextInt();
		chopper.next();
		grades = new double[number];
		int count = 0;
		while (chopper.hasNextDouble()){
			double value = chopper.nextDouble();
			setGrade(count++, value);
		}
			
			
		
	}

	public void setGrade(int spot, double grade) {
		// check
		grades[spot] = grade;
	}

	public double getSum() {
		double sum = 0.0;
		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
		}

		return sum;
	}

	public double getLowGrade() {
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.length; i++){
			low = Math.min(low, grades[i]);
		}

		return low;
	}

	public double getHighGrade() {
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.length; i++){
			high = Math.max(high, grades[i]);
		}

		return high;
	}

	public int getNumGrades() {
		return grades.length;
	}

	public String toString() {
		String output = "";

		for (int i = 0; i < grades.length; i++){
			output = output + grades[i];
			if (i < grades.length - 1){
				output = output + " ";
			}
		}
		
		return output;
	}
	
	//written by me
	public int getGradeCount(){
		return grades.length;
	}
	
}