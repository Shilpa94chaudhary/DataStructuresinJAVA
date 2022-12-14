package QueueAssignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public static void reverseQueue(Queue<Integer> input) {
		if(input.size()==0) {
			return;
		}
		Stack<Integer> stack = new Stack<Integer>();
		while(!input.isEmpty()) {
			stack.add(input.poll());
		}
		while(!stack.isEmpty()) {
			input.add(stack.pop());
		}
		
	}
	
	public static void print(Queue<Integer> input) {
		if(input.size()==0) {
			return;
		}
		
		while(!input.isEmpty()) {
			System.out.println(input.poll());
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1 ; i<=5 ;i++) {
			queue.add(i);
		}
		reverseQueue(queue);
		print(queue);

	}

}
