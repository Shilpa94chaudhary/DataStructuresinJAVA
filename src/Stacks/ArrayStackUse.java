package Stacks;

public class ArrayStackUse {

	public static void main(String[] args) {

		StackUsingArray stack = new StackUsingArray();
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			e.printStackTrace();
		}
		try {
			stack.push(10);
		} catch (StackOverflowException e) {
			e.printStackTrace();
		}
		try {
			stack.push(20);
		} catch (StackOverflowException e) {
			e.printStackTrace();
		}
		try {
			stack.push(30);
		} catch (StackOverflowException e) {
			e.printStackTrace();
		}
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			e.printStackTrace();
		}
		System.out.println("Pop " + stack.pop());
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			e.printStackTrace();
		}
		System.out.println("Size " + stack.size());
		try {
			System.out.println("Stack is empty " + stack.isEmpty());
		} catch (StackUnderflowException e) {
			e.printStackTrace();
		}
		
		// Fill complete stack
		try {
			for(int i = 0; i<10 ; i++) {
				stack.push(i*10);
			}
		} catch (StackOverflowException e) {
			e.printStackTrace();
		}
		
		// Print stack
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			e.printStackTrace();
		}
	}
}
