package TimeComplexity;

import java.util.Arrays;

public class DuplicateInArray {

//	public static int findDuplicate(int[] arr) {
//		for(int i =0 ; i<arr.length-1; i++) {
//            if(i==arr.length-1){
//                return arr[i];
//            }
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					return arr[i];
//				}
//			}
//		}
//		return 0;
//	}
	
	// If we use sorted array, then it will take less time to find duplicate
	// There is one condition: only one number have duplicate
	public static int findDuplicate(int[] arr) {
		Arrays.sort(arr);
		for(int i=0 ; i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] arr= {4,1,2,3,3};
		System.out.println(findDuplicate(arr));
		
		int[] arr1= {8, 4, 9, 1, 8};
		System.out.println(findDuplicate(arr1));
		
		int[] arr2= {0, 2, 1, 3, 1};
		System.out.println(findDuplicate(arr2));
		
		int[] arr3= {0, 7, 2, 5, 4, 7, 1, 3, 6 };
		System.out.println(findDuplicate(arr3));

	}

}
