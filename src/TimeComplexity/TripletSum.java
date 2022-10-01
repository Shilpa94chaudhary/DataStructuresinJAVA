package TimeComplexity;

import java.util.Arrays;

public class TripletSum {
	
	// Time Complexity O(n3)
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
//		int[] arr= {1, 2, 3, 4, 5, 6, 7 };
//		System.out.println(tripletSum(arr,12));
		// Output: 5

//		int[] arr1= {2, 5, 8, -6, 0, 5, 10, 11, -3};
//		System.out.println(tripletSum(arr1,10));
		// Output: 5

//		int[] arr2= {1, 2, 3, 4, 5, 6, 7};
//		System.out.println(tripletSum(arr2,19));
		// Output: 0
		
//		int arr2[]= {3,3,4,2};
//		System.out.println(tripletSum(arr2,9));
		
//		int arr3[]= {1,3,4,2,7,1,8,4};
//		System.out.println(tripletSum(arr3,9));
		
//		int arr1[]= {1,3,4,2,7,3,8,3};
//		System.out.println(tripletSum(arr1,9));
		
//		int arr[]= {6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
//		System.out.println(tripletSum(arr,5));
		
		int arr[]= {1,3,4,2,7,1,8,4};
		System.out.println(tripletSum(arr,9));
		
		int arr1[]= {1,3,4,2,7,3,8,3};
		System.out.println(tripletSum(arr1,9));
	}
}

