package RecursionAssignment;

import java.util.Scanner;

public class PairStar {

	public static String addStars(String s) {
		if(s.length()==1) {
			return s;
		}
		String newStr;
//		System.out.println(s);
		if(s.charAt(0)==s.charAt(1)) {
			newStr = s.charAt(0) + "*" + addStars(s.substring(1));
		}else {
			newStr = s.charAt(0) + addStars(s.substring(1));
		}
//		System.out.println(newStr);
		return newStr;
	}
	
	/*
	 * Input: aaabca
	 * Output: a*a*abca
	 */
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
	}

}
