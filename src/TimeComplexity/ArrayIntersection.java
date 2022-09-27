package TimeComplexity;

import java.util.Arrays;

public class ArrayIntersection {
	
	public static void intersection(int[] arr1,int[] arr2) {

		if(arr1.length==0 || arr2.length==0)
			return ;
		
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int i=0, j=0;
			while(i<arr1.length && j<arr2.length) {
				if(arr1[i]<arr2[j]) {
					i++;
				}else if(arr1[i]>arr2[j]) {
					j++;
				}else {
					System.out.print(arr1[i]+" ");
					i++; j++;
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
