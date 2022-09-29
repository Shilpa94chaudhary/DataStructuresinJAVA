package TimeComplexity;

public class RotateArray {

	public static void rotate(int[] arr, int d) {
		int temp[] = new int[d];
        int index=0;
        for(int i=0; i<arr.length ; i++){
            if(i<d){
                temp[i]=arr[i];
            }
            
            if(i< arr.length - d){
                arr[i]=arr[i+d];
            }else{
                arr[i] = temp[index];
                index++;
            }
        }
    }
	
	public static void printArray(int [] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 3, 6, 2, 5, 4, 3, 2, 4};
//		printArray(arr);
		rotate(arr,2);
		printArray(arr);
		
		int[] arr1= {1, 3, 6, 2, 5, 4, 3, 2, 4};
//		printArray(arr1);
		rotate(arr1, 6);
		printArray(arr1);
	}

}
