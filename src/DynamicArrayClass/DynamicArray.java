package DynamicArrayClass;

public class DynamicArray {

	private int data[];
	private int nextElementIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}
	
	public void add(int num) {
		data[nextElementIndex] = num;
		nextElementIndex++;
	}

	public int size() {
		return nextElementIndex;
	}

	public int getElementAt(int index) {
		if(nextElementIndex <= index) {
			// Through an error
			return -1;
		}
		return data[index];
	}

	public void setElementAt(int index, int num) {
		if(index >= nextElementIndex) {
			// Through an error
			return;
		}
		data[index] = num;
	}

	public boolean isEmpty() {
		return nextElementIndex == 0;
	}

	public int removeLast() {
		nextElementIndex --;
		return data[nextElementIndex];
	}

}
