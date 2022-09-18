package Recursion;

import java.util.Scanner;

public class FirstIndexOfNumberInArray {

	static Scanner s = new Scanner(System.in);
	
	public static int startIndex(int input[],int x, int si){
        if(si == input.length) {
        	return -1;
        }
        if(input[si]==x) {
        	return si;
        }
        return startIndex(input,x,si+1);
    }
	
	public static int firstIndex(int input[], int x) {
		return startIndex(input,x,0);
	}
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}

}
