package RecursionAssignment;

import java.util.Scanner;

public class CheckAB {

	/*
	 * a. The string begins with an 'a'
	 * b. Each 'a' is followed by nothing or an 'a' or "bb"
	 * c. Each "bb" is followed by nothing or an 'a'
	 */
	public static boolean checkAB(String input) {
		if(input.length()==0) {
			return true;
		}
		if(input.length()==1) {
			return (input.charAt(0)=='a');
		}
		if(input.charAt(0)=='a') {
			if (input.length()==2) {
				return checkAB(input.substring(1));
			}else if(input.charAt(1)=='a') {
				return checkAB(input.substring(1));
			}else if(input.charAt(1)=='b' && input.charAt(2)=='b') {
				return checkAB(input.substring(3));
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}

}
