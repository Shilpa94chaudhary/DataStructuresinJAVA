package Recursion;

import java.util.Scanner;

public class CheckArrayIsSorted {

	// Note: This function will create a copy of smallArray
	public static boolean isSorted(int a[]) {
		if(a.length == 1) {
			return true;
		}
		if(a[0]>a[1]) {
			return false;
		}
		int smallArray[] = new int[a.length - 1];
		
		for(int i = 1 ; i < a.length ; i++) {
			smallArray[i-1] = a[i];
		}
		boolean isSmallArraySorted = isSorted(smallArray);
		return isSmallArraySorted;
	}
	
	// This function will use same array without creating any copy
	public static boolean isSorted(int a[], int si) {
		if(si == a.length-1) {
			return true;
		}
		if(a[si]>a[si+1]) {
			return false;
		}
		boolean isSmallArraySorted = isSorted(a, si+1);
		return isSmallArraySorted;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		int size;
		System.out.print("Size of an Array1: ");
		size = s.nextInt();
		
		int arr1[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i = 0 ; i<size ; i++) {
			arr1[i] = s.nextInt();
		}
		
		System.out.println(isSorted(arr1));
		
		System.out.print("Size of an Array2: ");
		size = s.nextInt();
		
		int arr2[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i = 0 ; i<size ; i++) {
			arr2[i] = s.nextInt();
		}
		
		System.out.println(isSorted(arr2));
	}

}
