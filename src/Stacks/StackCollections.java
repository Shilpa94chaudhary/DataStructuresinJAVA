package Stacks;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int arr[] = {3, 5, 1, 7, 10, 8};
		
		for(int num : arr) {
			stack.push(num);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		
//		stack.push(10);
//		System.out.println(stack.size());
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
	}

}
