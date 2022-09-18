package Recursion1;

import java.util.Scanner;

public class PrintFirstNNaturalNumbers {

	public static void print(int n){
		if(n<=0) {
			return;
		}
		print(n-1);
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);
		
	}

}
