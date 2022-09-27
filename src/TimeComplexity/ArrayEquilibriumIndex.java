package TimeComplexity;

public class ArrayEquilibriumIndex {

	public static int arrayEquilibriumIndex(int[] arr){  
		if(arr.length==0) {
			return -1;
		}
		int leftSum = 0;
		int rightSum = 0;
		for(int i=1 ; i<arr.length ; i++) {
			rightSum += arr[i];
		}
		if(leftSum == rightSum) {
			return 0;
		}
		for(int i=1 ; i<arr.length ; i++) {
			leftSum += arr[i-1];
			rightSum -= arr[i];
			if(leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,2};
		System.out.println(arrayEquilibriumIndex(arr));
		
		int[] arr1= {1, 4, 9, 3, 2};
		System.out.println(arrayEquilibriumIndex(arr1));
		
		int[] arr2= {1, 0, 0, 0, 0};
		System.out.println(arrayEquilibriumIndex(arr2));
		
	}

}
