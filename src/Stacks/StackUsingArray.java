package Stacks;

public class StackUsingArray {

	private int data[];
	private int topIndex;

	public StackUsingArray(){
		data = new int[10];
		topIndex = -1;
	}

	// O(1)
	public int size() {
		return topIndex+1;
	}

	// O(1)
	public boolean isEmpty() throws StackUnderflowException {
		if(topIndex == -1) {
			throw new StackUnderflowException();
		}
		return false;
	}

	// O(1)
	public void push(int element) throws StackOverflowException {
		if(topIndex == data.length - 1) {
//			throw new StackOverflowException();
//			Instead of throwing Stack Over Flow Exception, double the size of the array
			doubleCapacity();
		}
		topIndex++;
		data[topIndex] = element;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int [temp.length * 2];
		for(int i = 0; i<temp.length ; i++) {
			data[i] = temp[i];
		}
	}

	// O(1)
	public int pop() throws StackUnderflowException {
		if(topIndex == -1) {
			throw new StackUnderflowException();
		}
		int temp = data[topIndex];
		data[topIndex] = 0;
		--topIndex;
		return temp;
	}

	// O(1)
	public int top() throws StackUnderflowException {
		if(topIndex == -1) {
			throw new StackUnderflowException();
		}
		return data[topIndex];
	}

	// O(n)
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
