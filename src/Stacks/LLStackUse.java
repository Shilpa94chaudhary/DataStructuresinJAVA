package Stacks;

public class LLStackUse {

	public static void main(String[] args) {
		
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		
		// Print the size of the stack
		System.out.println("Size " + stack.size());
		
		stack.push(30);
		stack.push(20);
		stack.push(10);
		
		stack.print();
		
		System.out.println("Size " + stack.size());
		
		try {
			System.out.println("Pop " + stack.pop());
		} catch (StackUnderflowException e1) {
			System.out.println("Stack Underflow Exception");
		}
		
		stack.print();
		
		System.out.println("Size " + stack.size());
		
		// Empty the stack
		while(!stack.isEmpty()) {
			try {
				System.out.println("Pop " + stack.pop());
			} catch (StackUnderflowException e) {
				System.out.println("Stack Underflow Exception");
			}
		}
		
		System.out.println("Size " + stack.size());
		
		for(int i = 0 ; i < 15 ; i++) {
			
		}
	}

}
