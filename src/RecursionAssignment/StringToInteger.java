package RecursionAssignment;

import java.util.Scanner;

public class StringToInteger {

	static Scanner s = new Scanner(System.in);
	
	public static int convertStringToInt(String input){
		if(input.length()==1) {
			int num = (int) input.charAt(0)-48;
			return num;
		}
		String subStr = input.substring(0, input.length()-1);
		int numResult = convertStringToInt(subStr);
		int num = (int) input.charAt(input.length()-1) - 48;
		num = num + 10 * numResult;
		return num;
	}
	/* 
	 * Input: 123
	 * 3 + 10 (12)
	 * 3 + 10 (2 + 10)
	 * 3 + 20+ 100
	 */
	
	public static void main(String[] args) {
		String input = s.nextLine();
		char ch = '1';
		int chint = (int)ch;
		System.out.println(chint);
		System.out.println(convertStringToInt(input));
	}

}
