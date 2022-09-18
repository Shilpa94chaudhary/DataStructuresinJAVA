package Recursion;

import java.util.Scanner;

public class FibonacciNumber {

	public static int fibNum(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int fibN = fibNum(n-1) + fibNum(n-2);
		return fibN;
		
	}
	
	public static void main (String arg[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("n: ");
		n = s.nextInt();
		System.out.println("nth Fibonacci Number: " + fibNum(n));
	}
}
