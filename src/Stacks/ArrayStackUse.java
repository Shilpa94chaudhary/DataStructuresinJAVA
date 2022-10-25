package Stacks;

public class ArrayStackUse {

	public static void main(String[] args) {

		StackUsingArray stack = new StackUsingArray();
		stack.print();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.print();
		System.out.println("Pop " + stack.pop());
		stack.print();
		System.out.println("Size " + stack.size());
		System.out.println("Stack is empty " + stack.isEmpty());
	}
}
