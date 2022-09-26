package TimeComplexity;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayWithGivenSum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
		int sum;
        for(int i=0; i<arr.length; i++){
            sum =arr[i];
            if(sum == s) {
            	numbers.add(i+1);
            	numbers.add(i+1); 
            	return numbers;
            }
            for(int j=i+1; j<arr.length;j++) {
            	sum += arr[j];
            	if(sum==s) {
            		numbers.add(i+1);
                	numbers.add(j+1);
                	return numbers;
            	}else if (sum > s)
            		break;
            	}
            }
        numbers.add(-1);
        return numbers;
    }
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int s = sc.nextInt();
			int arr [] = new int [n];
			for(int i = 0; i<n ;i++) {
				arr[i] = sc.nextInt();
			}
			ArrayList<Integer> res = subarraySum(arr,n,s);
			for(int i = 0; i<res.size() ;i++) {
				System.out.println(res.get(i)+" ");
			}
	}
}
