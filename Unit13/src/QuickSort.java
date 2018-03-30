
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays; //use Arrays.toString() to help print out the array

public class QuickSort {
	private static int passCount;

	public static void quickSort(Comparable[] list) {
		passCount=0;
		quickSort(list, 0, list.length - 1);
		System.out.println();
	}

	// written by me
	private static void swap(int item1, int item2, Comparable[] list) {
		Comparable leftTemp = list[item1];
		list[item1] = list[item2];
		list[item2] = leftTemp;
	}

	private static void quickSort(Comparable[] list, int low, int high) {
		if (low >= high) {
			return;
		}
		int split = partition(list, low, high);
		quickSort(list, low, split);
		quickSort(list, split + 1, high);
		
		

	}

	private static int partition(Comparable[] list, int bottom, int top) {
		int pivotLoc = top;
		Comparable pivot = list[pivotLoc];
		int left = bottom;
		int right = pivotLoc - 1;

		while (left != right) {
			Comparable leftItem = list[left];
			Comparable rightItem = list[right];

			if (leftItem.compareTo(pivot) < 0) {
				left++;
				continue;
			}

			if (rightItem.compareTo(pivot) > 0) {
				right--;
				continue;
			}
			
			swap(left, right, list);
		}
		// once equal, swap (left == right)
		if (list[pivotLoc].compareTo(list[right]) < 0){
			swap(pivotLoc, right, list);
		}
		
		System.out.print("pass " + passCount + " [");
		for (int i = 0; i < list.length -1; i++){
			System.out.print(list[i] + ", ");
		}
		System.out.print(list[list.length -1 ] + "]\n");
		passCount++;
		
		return left;

	}
}