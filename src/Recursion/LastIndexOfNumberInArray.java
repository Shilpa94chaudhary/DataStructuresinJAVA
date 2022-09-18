package Recursion;

import java.util.Scanner;

public class LastIndexOfNumberInArray {

	// Check from front to back
	static Scanner s = new Scanner(System.in);
	public static int lastIndex(int input[], int x) {
		if(input.length == 0) {
				return -1;
		}
		if(input[input.length-1] == x) {
			return input.length - 1 ;
		}
		int smallArr[] = new int [input.length - 1];
		for(int i = 0 ; i < input.length - 1 ; i++) {
			smallArr[i]= input[i];
		}
		int index = lastIndex(smallArr,x);
		return index;
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
		System.out.println(lastIndex(input, x));
	}

}
