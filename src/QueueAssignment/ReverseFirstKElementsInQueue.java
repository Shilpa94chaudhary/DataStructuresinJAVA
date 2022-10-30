package QueueAssignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsInQueue {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		if(input.size()==0 || k>input.size()) {
			return input;
		}
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> temp = new LinkedList<Integer>();
		for(int i=0; i<k ; i++) {
			stack.add(input.poll());
		}
		
		while(!stack.isEmpty()) {
			temp.add(stack.pop());
		}
		
		while(!input.isEmpty()) {
			temp.add(input.poll());
		}
		
		return temp;
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
		queue = reverseKElements(queue,3);
		print(queue);

	}

}
