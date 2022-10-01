package TimeComplexity;

import java.util.Arrays;

public class PairSumInArray {

	public static int pairSum(int[] arr, int s) {
		if(arr.length<=1) {
			return 0;
		}
		int count = 0;
		int l = arr.length;
		Arrays.sort(arr);
		for(int i=0; i<l-1 ; i++) {
			for(int j=i+1 ; j<l; j++) {
				if(arr[i]+arr[j]==s) {
					count ++;
					continue;
				}if(arr[i]+arr[j]>s) {
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 3, 6, 2, 5, 5, 4, 3, 2, 5, 5, 5};
		System.out.println(pairSum(arr,10));
		
		int[] arr2= {1, 3, 6, 2, 5, 5, 4, 3, 2, 4};
		System.out.println(pairSum(arr2,10));
		
		int[] arr1= {1, 3, 6, 2, 5, 4, 3, 2, 4};
		System.out.println(pairSum(arr1,12));

	}

}
