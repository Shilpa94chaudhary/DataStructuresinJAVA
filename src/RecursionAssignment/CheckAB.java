package RecursionAssignment;

import java.util.Scanner;

public class CheckAB {

	/*
	 * a. The string begins with an 'a'
	 * b. Each 'a' is followed by nothing or an 'a' or "bb"
	 * c. Each "bb" is followed by nothing or an 'a'
	 */
	public static boolean checkAB(String input) {
		if(input.length()==1) {
			if(input.charAt(0)=='a') {
				return true;
			}else {
				return false;
			}
		}
		boolean condition1 = (input.charAt(0)=='a') && (input.charAt(1)=='a');
		if(input.length()==2) {
			if(condition1) {
				return true;
			}else {
				return false;
			}
		}
		System.out.println(input.subSequence(1, 3));
		boolean condition2 = input.charAt(0)=='a' && input.subSequence(1, 3).equals("bb");
		if(input.length()==3) {
			if(condition2) {
				return true;
			}else {
				return false;
			}
		}
		boolean isAB;
		if(condition1) {
			isAB = true && checkAB(input.substring(2));
		}else if(condition2) {
			isAB = true && checkAB(input.substring(3));
		}else {
			isAB = false;
		}
		System.out.println(isAB);
		return isAB;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}

}
