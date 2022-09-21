package Recursion2;

import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int[] arr){
		if(arr.length <= 1) {
			return;
		}
		
		if(arr.length == 2) {
			if(arr[0]>arr[1]) {
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
			}
			return;
		}
		
		int size = arr.length;
		int mid = size/2;
		
		int s1[] = new int[mid];
		int s2[] = new int[size - mid];
		
		for(int i = 0 ; i < mid ; i++) {
			s1[i] = arr[i];
		}
		mergeSort(s1);
		for(int i = 0 ; i < size - mid ; i++) {
			s2[i] = arr[mid + i];
		}
		mergeSort(s2);
		
		merge(arr, s1, s2);
	}
	
	public static void merge(int arr[], int s1[],int s2[]) {
		
		int i = 0, j = 0, k = 0;
		
		while(i<arr.length) {
			if(j==s1.length) {
				arr[i]=s2[k];
				i++; k++;
			}else if(k == s2.length) {
				arr[i] = s1[j];
				i++; j++;
			}else if(s1[j]<s2[k]) {
				arr[i]=s1[j];
				i++; j++;
			}else {
				arr[i]=s2[k];
				i++; k++;
			}
		}
		
	}
	
	public static int[] takeInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
//		int[] input = {1,5,3,77,2,6,8,4,2};
		mergeSort(input);
		printArray(input);
	}
}
