package TimeComplexity;

import java.util.Arrays;

public class ArrayIntersection {

	public static void intersection(int[] arr1,int[] arr2) {

		if(arr1.length==0 || arr2.length==0)
			return ;
		
			Arrays.sort(arr1);
			for(int i=0 ; i<arr1.length ; i++) {
				for(int j=0 ; j<arr2.length; j++) {
					if(arr1[i]==arr2[j]) {
						System.out.print(arr1[i]+" ");
                        arr2[j]=0;
						break;
					}
				}
			}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr1= {2,6,1,2};
		int[] arr2= {1,2,3,4,2};
		intersection(arr1, arr2);
		
		int[] arr3= {10,10};
		int[] arr4= {10};
		intersection(arr3, arr4);
	}

}
