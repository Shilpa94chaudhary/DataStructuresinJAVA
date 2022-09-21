package Recursion;

public class RecursionWithString {

	public static String replaceChar(String str, char a, char b) {
		if(str.length() == 0) {
			return str;
		}
		String smallStr = replaceChar(str.substring(1), a, b);
		if(str.charAt(0) == a) {
			str = b + smallStr;
		}else {
			str = str.charAt(0) + smallStr;
		}
		return str;
	}
	
	public static void main(String[] args) {
		String str = "Hi My name is Shilpa Chaudhary";
		System.out.println(replaceChar(str, 'a', 'z'));
	}

}
