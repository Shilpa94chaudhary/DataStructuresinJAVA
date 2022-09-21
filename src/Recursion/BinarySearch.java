package Recursion;

import java.util.Scanner;

public class BinarySearch {

	static Scanner s = new Scanner(System.in);
	
	public static int binarySearch(int arr[], int si, int ei, int x) {
		if(si > ei){
			return -1;
		}
		int mi = (si+ei)/2;
		if(arr[mi] == x) {
			return mi;
		}else if(arr[mi] < x) {
			return binarySearch(arr, mi+1 , ei , x);
		}else {
			return binarySearch(arr, si , mi-1 , x);
		}
	}
	
	public static int[] takeInput() {
		
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(binarySearch(input, 0, input.length-1, x));
	}

}
