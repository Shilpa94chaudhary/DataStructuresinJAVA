package Recursion;

import java.util.Scanner;

public class ReplacePi {

	public static String replacePi(String str) {
		if(str.length() <= 1) {
			return str;
		}
		if(str.subSequence(0,2).equals("Pi") || str.subSequence(0,2).equals("pi") || str.subSequence(0,2).equals("PI")) {
			String smallStr = replacePi(str.substring(2));
			return "3.14" + smallStr;
		}else {
			String smallStr = replacePi(str.substring(1));
			return str.charAt(0) + smallStr;
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(replacePi(input));
	}

}
