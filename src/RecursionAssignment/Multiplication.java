package RecursionAssignment;

import java.util.Scanner;

public class Multiplication {
	
	static Scanner s = new Scanner(System.in);
	
	/* Given two integers M & N, calculate and return their 
	 * multiplication using recursion. You can only use 
	 * subtraction and addition for your calculation. 
	 * No other operators are allowed.
	 */

	public static int multiplyTwoIntegers(int m, int n){
		if(m == 0 || n == 0) {
			return 0;
		}
		if(m==1) {
			return n;
		}
		if(n==1) {
			return m;
		}
		int result = m + multiplyTwoIntegers(m, n-1);
		return result;
	}
	
	public static void main(String[] args) {
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(multiplyTwoIntegers(a, b));
	}

}
