package Test1;

public class SplitArray {

	/*
	 * Given an integer array A of size N, check if the input array can be splitted in two 
	 * parts such that -
	 * - Sum of both parts is equal
	 * - All elements in the input, which are divisible by 5 should be in same group.
	 * - All elements in the input, which are divisible by 3 (but not divisible by 5) should 
	 * be in other group.
	 * - Elements which are neither divisible by 5 nor by 3, can be put in any group.
	 */
	
	public static boolean splitArray(int input[]) {
		return splitArray(input, 0, 0, 0);
	}
	
	private static boolean splitArray(int input[] ,int si,int lSum ,int rSum) {
		if(si == input.length) {
			return (lSum == rSum);
		}
		
		if(input[si] % 5 == 0) {
			lSum += input[si];
		}else if(input[si] % 3 == 0) {
			rSum += input[si];
		}else {
			return (splitArray(input, si+1, lSum + input[si], rSum) || splitArray(input, si+1, lSum , rSum + input[si]));
		}
		
		
		return splitArray(input, si+1, lSum, rSum);
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2};
		System.out.println(splitArray(arr1));
		
		int arr2[] = {1,4,3};
		System.out.println(splitArray(arr2));
	}

}
