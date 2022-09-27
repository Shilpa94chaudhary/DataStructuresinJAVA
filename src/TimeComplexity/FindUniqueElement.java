package TimeComplexity;

public class FindUniqueElement {

	public static int findUnique(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int l=arr.length;
		boolean isVisited[]= new boolean[l];
		for(int i=0; i<l-1; i++) {
			if(isVisited[i]==true) {
				continue;
			}
			int j;
			for(j=i+1; j<l;j++) {
				if(arr[i]==arr[j]) {
					isVisited[j]=true;
					break;
				}	
			}
			if(j == l) {
				return arr[i];
			}
		}
		return arr[l-1];
	}
	
	public static void main(String[] args) {
//		int[] arr= {4,2,2,4,3};
//		System.out.println(findUnique(arr));
//		
//		int[] arr1= {18, 4, 9, 4, 18};
//		System.out.println(findUnique(arr1));
//		
//		int[] arr2= {13, 0, 0, 2, 2};
//		System.out.println(findUnique(arr2));
		
		int[] arr3= {1, 7, 1, 3, 7 };
		System.out.println(findUnique(arr3));

	}

}
