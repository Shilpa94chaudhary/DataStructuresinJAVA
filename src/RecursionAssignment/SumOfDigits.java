package RecursionAssignment;

import java.util.Scanner;

public class SumOfDigits {

	static Scanner s = new Scanner(System.in);
	
	public static int sumOfDigits(int input){
		if(input == 0) {
			return input;
		}
		int sum = 0;
		sum = input%10 + sumOfDigits(input/10);
		return sum;

	}
	
	public static void main(String[] args) {
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
	}

}
