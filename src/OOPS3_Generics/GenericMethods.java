package OOPS3_Generics;

public class GenericMethods {

	public static <T> void printArray(T arr[]) {
		for(int i = 0; i< arr.length ; i++ ) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		// int is primitive data type, it will not work
		@SuppressWarnings("unused")
		int arr1[] = {1,2,3,4,5};
//		printArray(arr1);
		
		Integer arr2[] = new Integer[5];
		for(int i = 0; i< arr2.length ; i++ ) {
			arr2[i] = i;
		}
		
		printArray(arr2);
		
		String arr3[] = new String[5];
		for(int i = 0; i< arr2.length ; i++ ) {
			arr3[i] = "abc";
		}
		
		printArray(arr3);

	}

}
