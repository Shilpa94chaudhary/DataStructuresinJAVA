package DynamicArrayClass;

public class DynamicArray {

	private int data[];
	private int nextElementIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}
	
	public void add(int num) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex] = num;
		nextElementIndex++;
	}

	private void doubleCapacity() {
		int temp[]=data;
		data = new int [2 * temp.length];
		for(int i = 0 ; i < temp.length ; i++) {
			data[i] = temp[i];
		}
	}

	public int size() {
		return nextElementIndex;
	}

	public int getElementAt(int index) {
		if(nextElementIndex <= index) {
			// Throw an error
			return -1;
		}
		return data[index];
	}

	public void setElementAt(int index, int num) {
		if(index >= nextElementIndex) {
			// Throw an error
			return;
		}
		data[index] = num;
	}

	public boolean isEmpty() {
		return nextElementIndex == 0;
	}

	public int removeLast() {
		if(nextElementIndex == 0) {
			return -1;
		}
		int temp = data[nextElementIndex-1];
		nextElementIndex --;
		return temp;
	}

	public void printDynamicArray() {
		for(int i = 0; i<data.length ; i++) {
			System.out.print(data[i]+" ");
		}
		
	}

}
