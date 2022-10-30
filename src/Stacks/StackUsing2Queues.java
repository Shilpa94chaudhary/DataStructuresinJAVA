package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

	private Queue<Integer> q1;
	private Queue<Integer> q2;
	private int size;

	StackUsing2Queues(){
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
		size=0;
	}

	public int getSize() { 
		//Implement the getSize() function
		return size;
	}

	public boolean isEmpty() {
		//Implement the isEmpty() function
		return size==0;
	}

	public void push(int element) {
		//Implement the push(element) function
		q2.add(element);
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		size++;
	}

	public int pop() {
		if(size==0) {
			return -1;
		}
		int temp = q1.poll();
		size--;
		return temp;
	}

	public int top() {
		if(size == 0) {
			return -1;
		}
		int temp = q1.poll();
		
		q2.add(temp);
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		return temp;
	}

}

/* stack:
 * 49  
 * 47
 * 13
 * Queue 1: 49 47 13
 * Queue 2: 49 
 */







