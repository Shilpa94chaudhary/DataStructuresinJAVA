package Stacks;

public class StackUsingArray {

	private int data[];
	private int topIndex;

	public StackUsingArray(){
		data = new int[10];
		topIndex = -1;
	}

	public int size() {
		if(topIndex == -1) {
			System.out.println("Underflow");
			return 0;
		}
		return topIndex+1;
	}

	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}
		return false;
	}

	public void push(int element) {
		if(topIndex == 9) {
			System.out.println("Overflow");
			return;
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

	public int top() {
		return data[topIndex];
	}

	public void print() {
		if(topIndex == -1) {
			System.out.println("Underflow");
			return;
		}
		for(int i=0 ; i<=topIndex ; i++) {
			System.out.print(data[i] +" ");
		}

		System.out.println();
	}
}
