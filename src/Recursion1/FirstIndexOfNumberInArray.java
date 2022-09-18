package Recursion1;

import java.util.Scanner;

public class FirstIndexOfNumberInArray {

	static Scanner s = new Scanner(System.in);
	
	public static int firstIndex(int input[], int x) {
		
		// Exit criteria
		if(input.length == 0) {
				return -1;
		}
		
		// If element is found at index 0 of the small array or initial array
		if(input[0] == x) {
			return 0;
		}
		
		// Create small array
		int smallArr[] = new int [input.length-1];
		for(int i=1 ; i<input.length ; i++) {
			smallArr[i-1] = input[i];
		}
		
		// Call for firstIndex with small array as element is not found
		int fi = firstIndex(smallArr,x);
		if(fi == -1) {
			return -1;
		}else {
			// As array size is decreased by 1 to check element, we have to add 1
			return fi + 1;
		}
	}
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}

}
