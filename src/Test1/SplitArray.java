package Test1;

public class SplitArray {

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
