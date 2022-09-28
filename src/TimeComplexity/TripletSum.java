package TimeComplexity;

import java.util.Arrays;

public class TripletSum {
	public static int tripletSum(int[] arr, int s) {
		if(arr.length<3) {
			return 0;
		}
		int count = 0;
		int l = arr.length;
		Arrays.sort(arr);
		for(int i=0; i<l-2 ; i++) {
			for(int j=i+1 ; j<l-1; j++) {
				if(arr[i]+arr[j]>s) {
					break;
				}
				for(int k=j+1 ; k<l ; k++) {
					if(arr[i]+arr[j]+arr[k]==s) {
						count ++;
						continue;
					}else if(arr[i]+arr[j]+arr[k]>s) {
						break;
					}

				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 6, 7 };
		System.out.println(tripletSum(arr,12));
		// Output: 5

		int[] arr1= {2, -5, 8, -6, 0, 5, 10, 11, -3};
		System.out.println(tripletSum(arr1,10));
		// Output: 5

		int[] arr2= {1, 2, 3, 4, 5, 6, 7};
		System.out.println(tripletSum(arr2,19));
		// Output: 0

	}

}
