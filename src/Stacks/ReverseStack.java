package Stacks;

import java.util.Stack;

public class ReverseStack {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if(input.size() <=1) {
			return;
		}
		
		int temp = input.pop();
		reverseStack(input, extra);
		
		while(!input.isEmpty()) {
			extra.push(input.pop());
		}
		
		input.push(temp);
		
		while(!extra.isEmpty()) {
			input.push(extra.pop());
		}
		
	}
	
	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		Stack<Integer> extra = new Stack<Integer>();
		input.push(1);
		input.push(4);
		input.push(3);
		input.push(7);
		input.push(9);
		input.push(2);
		
		reverseStack(input,extra);
		
		while(!input.isEmpty()) {
			System.out.println(input.pop());
		}

	}

}
