package Recursion2;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {

    static Scanner s = new Scanner(System.in);
	
    public static String removeConsecutiveDuplicates(String str) {
		if(str.length() <= 1) {
			return str;
		}
		String smallStr = removeConsecutiveDuplicates(str.substring(1));
		if(str.charAt(0) == str.charAt(1)) {
			return smallStr;
		}else {
			return str.charAt(0)+smallStr;
		}
	}
    
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input));
    	/*
    	 * Input : aacbxx
    	 * Output: acbx
    	 */
    }

}
