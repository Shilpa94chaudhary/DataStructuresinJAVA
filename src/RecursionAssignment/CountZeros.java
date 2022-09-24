package RecursionAssignment;

import java.util.Scanner;

public class CountZeros {

	static Scanner s = new Scanner(System.in);
	
	public static int countZerosRec(int input){
		// Input: 000, Output: 1
		if(input==0) {
			return 1;
		}
		
		if(input/10==0) {
			return 0;
		}
		int count = countZerosRec(input/10);
		if(input%10 == 0) {
			return count += 1;
		}else {
			return count;
		}
	}
	
	public static void main(String[] args) {
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
	}

}
