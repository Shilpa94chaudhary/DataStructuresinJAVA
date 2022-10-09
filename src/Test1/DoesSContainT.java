package Test1;

public class DoesSContainT {

	/*
	 * Given two string s and t, write a function to check if s contains all characters 
	 * of t (in the same order as they are in string t).
	 * Return true or false.
	 * Do it recursively.
	 * E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” 
	 * in the same order. So function will return true.
	 */
	
	public static boolean checkSequence(String a, String b) {
			if(b.length() == 0){
	            return true;
	        }
	        if(a.length() == 0){
	            return false;
	        }
	        if(a.charAt(0)==b.charAt(0)) {
	        	a = a.substring(1);
	        	b = b.substring(1);
	        }else {
	        	a = a.substring(1);
	        }
	        
	        boolean ans = checkSequence(a,b);
	        return ans;
	}
	
	public static void main(String[] args) {
		String s = "abchjsgsuohhdhyrikkknddg";
		String t = "coding";
		System.out.println(checkSequence(s,t));
		
		String s1 = "abcde";
		String t1 = "aeb";
		System.out.println(checkSequence(s1,t1));
	}

}
