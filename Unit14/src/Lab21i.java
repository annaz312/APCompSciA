//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner chopper = new Scanner(new File("lab21i.dat"));
		int size = chopper.nextInt();
		chopper.nextLine();
		String line = chopper.nextLine();
		
		Maze test = new Maze(size,line);
		test.hasExitPath(0,0);
		System.out.println(test);
		
		size = chopper.nextInt();
		chopper.nextLine();
		line = chopper.nextLine();
		Maze test2 = new Maze(size,line);
		test2.hasExitPath(0,0);
		System.out.println(test2);
		
		size = chopper.nextInt();
		chopper.nextLine();
		line = chopper.nextLine();
		Maze test3 = new Maze(size,line);
		test3.hasExitPath(0,0);
		System.out.println(test3);
		
		size = chopper.nextInt();
		chopper.nextLine();
		line = chopper.nextLine();
		test = new Maze(size,line);
		test.hasExitPath(0,0);
		System.out.println(test);
		
		size = chopper.nextInt();
		chopper.nextLine();
		line = chopper.nextLine();
		test = new Maze(size,line);
		test.hasExitPath(0,0);
		System.out.println(test);
		
		size = chopper.nextInt();
		chopper.nextLine();
		line = chopper.nextLine();
		test = new Maze(size,line);
		test.hasExitPath(0,0);
		System.out.println(test);
		
	}
}