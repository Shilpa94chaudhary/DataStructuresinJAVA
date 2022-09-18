package Recursion1;

import java.util.Scanner;

public class CalculatePower {
	
	static Scanner s = new Scanner(System.in);

	public static int power(int x, int n) {
		if(n == 0){
            return 1;
        }
        int result = x * power(x,n-1);
		return result;
	}
	
	public static void main(String[] args) {
		
		int x = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(power(x, n));
	}

}
