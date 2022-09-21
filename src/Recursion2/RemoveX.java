package Recursion2;

import java.util.Scanner;

public class RemoveX {
	
	public static String removeX(String str){
		if(str.length() == 0) {
			return str;
		}
		String smallStr = removeX(str.substring(1));
		if(str.charAt(0)== 'x' || str.charAt(0) == 'X') {
			return smallStr;
		}else {
			return (str.charAt(0)+smallStr);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(removeX(input));
	}

}
