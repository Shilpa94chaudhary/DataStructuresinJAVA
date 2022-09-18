package Recursion1;

import java.util.Scanner;

public class NumberOfDigits {

	public static int count(int n){
		if(n == 0) {
			return 0;
		}
		int digit = 1 + count(n/10);
		
		return digit;
    }
	
	/*
	 * count(1426)
	 * 1+ count(142)
	 * 1+1+ count(14)
	 * 1+1+1+ count(1)
	 * 1+1+1+1+ count(0)
	 * 1+1+1+1+0
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(count(n));
	}

}
