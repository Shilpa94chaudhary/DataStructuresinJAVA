package RecursionAssignment;

import java.util.Scanner;

public class Staircase {
	
	public static int staircase(int n){
		if(n==1 || n==0) {
			return 1;
		}else if(n<0) {
			return 0;
		}
		int count = staircase(n-1) + staircase(n-2) + staircase(n-3);
		return count;

	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(staircase(n));
	}

}
