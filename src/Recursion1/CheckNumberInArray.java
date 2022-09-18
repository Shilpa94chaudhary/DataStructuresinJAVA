package Recursion1;

import java.util.Scanner;

public class CheckNumberInArray {
	static Scanner s = new Scanner(System.in);
	
	public static boolean checkNumber(int input[], int x) {
		if(input.length == 1) {
			if(input[0] == x) {
				return true;
			}else {
				return false;
			}
		}
		if(input[0] == x) {
			return true;
		}
		int smallArr[] = new int[input.length-1];
		for(int i=1 ; i<input.length ; i++) {
			smallArr[i-1] = input[i];
		}
		boolean isPresent = checkNumber(smallArr, x);
		return isPresent;
	}
	
	

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}
}
