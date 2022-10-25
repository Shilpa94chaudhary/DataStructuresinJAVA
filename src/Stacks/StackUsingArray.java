package Stacks;

public class StackUsingArray {

	private int data[];
	private int topIndex;

	public StackUsingArray(){
		data = new int[10];
		topIndex = -1;
	}

	public int size() {
		return topIndex+1;
	}

	public boolean isEmpty() throws StackUnderflowException {
		if(topIndex == -1) {
			throw new StackUnderflowException();
		}
		return false;
	}

	public void push(int element) throws StackOverflowException {
		if(topIndex == 9) {
			throw new StackOverflowException();
		}
		topIndex++;
		data[topIndex] = element;
	}

	public int pop() {
		int temp = data[topIndex];
		data[topIndex] = 0;
		--topIndex;
		return temp;
	}

	public int top() throws StackUnderflowException {
		if(topIndex == -1) {
			throw new StackUnderflowException();
		}
		return data[topIndex];
	}

	public void print() throws StackUnderflowException {
		if(topIndex == -1) {
			throw new StackUnderflowException();
		}
		
		for(int i=0 ; i<=topIndex ; i++) {
			System.out.print(data[i] +" ");
		}

		System.out.println();
	}
}
