package Stacks;

public class ArrayStackUse {

	public static void main(String[] args) {

		StackUsingArray stack = new StackUsingArray();
		
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			System.out.println("Stack Underflow Exception");
		}
		
		
		try {
			stack.push(10);
		} catch (StackOverflowException e) {
			System.out.println("Stack Overflow Exceptionn");
		}
		
		
		try {
			stack.push(20);
		} catch (StackOverflowException e) {
			System.out.println("Stack Overflow Exceptionn");
		}
		
		
		try {
			stack.push(30);
		} catch (StackOverflowException e) {
			System.out.println("Stack Overflow Exceptionn");
		}
		
		
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			System.out.println("Stack Underflow Exception");
		}
		
		
//		try {
//			System.out.println("Pop " + stack.pop());
//		} catch (StackUnderflowException e1) {
//			System.out.println("Stack UnderflowE xception");
//		}
		
		
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			System.out.println("Stack Underflow Exception");
		}
		
		
		System.out.println("Size " + stack.size());
		
		
		try {
			System.out.println("Stack is empty " + stack.isEmpty());
		} catch (StackUnderflowException e) {
			System.out.println("Stack Underflow Exception");
		}

		// Fill complete stack
		try {
			for(int i = 0; i<10 ; i++) {
				stack.push(i*10);
			}
		} catch (StackOverflowException e) {
			System.out.println("Stack Overflow Exceptionn");
		}

		System.out.println("Size " + stack.size());
		
		
		// Print stack
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			System.out.println("Stack Underflow Exception");
		}

		// Empty complete stack

		for(int i = 0; i<10 ; i++) {
			try {
				System.out.println("Pop " + stack.pop());
			} catch (StackUnderflowException e) {
				System.out.println("Stack Underflow Exception");
			}
		}

		System.out.println("Size " + stack.size());
		
		// Print stack
		try {
			stack.print();
		} catch (StackUnderflowException e) {
			System.out.println("Stack Underflow Exception");
		}
	}
}
