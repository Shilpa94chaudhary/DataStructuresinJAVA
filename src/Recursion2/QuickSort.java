package Recursion2;

import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int arr[]) {
		if(arr.length<=1) {
			return;
		}
		
		// Calculate size of the array
		int size = arr.length;
		
		// Create a temporary array of size
		int tempArr[] = new int[size];

		// Find last element
		int lastElement = arr[size-1];
		
		// Copy all numbers smaller than last number into temporary array one by one
		int j=0;
		int i;
		for(i = 0 ; i < size-1 ; i++) {
			if(lastElement>arr[i]) {
				tempArr[j]=arr[i];
				j++;
			}
		}
		
		// Copy last element into temporary array
		tempArr[j]=lastElement;
		int mid = j;
		j++;
		
		// Copy all numbers greater than or equals to the last number into temporary array
		for(i = 0 ; i < size-1 ; i++) {
			if(lastElement<=arr[i]) {
				tempArr[j]=arr[i];
				j++;
			}
		}
		
		// Set original array equals to temporary array
		for(i = 0 ; i < size ; i++) {
			arr[i] = tempArr[i];
		}
		
		// Divide array into two parts to apply quick sort on small arrays
		int smallArr1[] = new int[mid];
		int smallArr2[] = new int[size-mid-1];
		
		// Copy right half and left half into small arrays
		for(i = 0 ; i < mid ; i++) {
			smallArr1[i] = arr[i];
		}
		for(i = 0 ; i < size-mid-1 ; i++) {
			smallArr2[i] = arr[mid+1+i];
		}
		
		// Call quick sort on small arrays
		quickSort(smallArr1);
		quickSort(smallArr2);
		
		// Copy sorted array into array
		for(i = 0 ; i < mid ; i++) {
			arr[i]=smallArr1[i];
		}
		for(i = 0 ; i < size-mid-1 ; i++) {
			arr[mid+1+i]=smallArr2[i];
		}
	}
	
	public static int[] takeInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
//		int[] input = takeInput();
		int[] input = {1,5,3,77,2,6,8};
		
		System.out.println("Input Array:");
		printArray(input);
		
		quickSort(input);
		
		System.out.println("\nSorted Array:");
		printArray(input);
	}

}
