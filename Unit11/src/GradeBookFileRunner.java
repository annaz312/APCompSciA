//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));

		String className = file.nextLine();
		int numStudents = file.nextInt();
		file.nextLine();
		
		Class myClass = new Class(className,numStudents);
		
		for (int i = 0; i < numStudents; i++){
			String stuName = file.nextLine();
			String gradeLine = file.nextLine();
			
			Student s = new Student(stuName, gradeLine);
			myClass.addStudent(i, s);
			
		}
		

		System.out.println(myClass.toString());
		myClass.sort();
		System.out.println(myClass.toString());











	}		
}