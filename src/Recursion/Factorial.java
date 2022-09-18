package Recursion;

import java.util.Scanner;

public class Factorial {

	
	public static int factorial(int n) {
		
		if(n <= 0) {
			return 1;
		}
		int fact = n * factorial(n-1);
		return fact;
	}
	
	public static int sumn(int n) {
		
		if(n <= 0) {
			return 0;
		}
		int sum = n + sumn(n-1);
		return sum;
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("Factorial of ");
		n = s.nextInt();
		System.out.println(factorial(n));
		
		System.out.print("Sum of ");
		n = s.nextInt();
		System.out.println(sumn(n));

	}

}
