package Queues;

public class QueueUsingArray {

	private int data[];
	private int front; // index of the element at the front of the queue
	private int rear; // index of the element at the rear of the queue
	private int size;

	QueueUsingArray(){
		data = new int[5];
		front = -1;
		rear = -1;
		size = 0;
	}

	QueueUsingArray(int capacity){
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}

	// Complexity O(1)
	public int size() {
		return size;
	}

	// Complexity O(1)
	public boolean isEmpty() {
		return size == 0;
	}

	// Complexity O(1)
	public void enqueue(int element) {
		if(size == 0) {
			front = 0;
		}
		if(size==data.length) {
			System.out.println("Queue is full");
			return;
		}
		//		rear++;
		//		// if rear is full and we want to insert data at 0 index
		//		if(rear == data.length) {
		//			rear = 0;
		//		}

		rear = (rear+1) % data.length;
		data[rear] = element;
		size++;
	}

	// Complexity O(1)
	public int front() {
		if(size  == 0) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			return data[front];
		}
	}

	// Complexity O(1)
	public int dequeue() {
		if(size==0) {
			System.out.println("Queue is empty");
			return -1;
		}
		int temp = data[front];
		//			front++;
		//			if(front == data.length) {
		//				front = 0;
		//			}
		front = (front+1) % data.length;
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
	
	// Complexity O(n)
	public void print() {
		if(size == 0) {
			return;
		}
		if(rear>=front) {
			for(int i = front ; i<=rear ; i++) {
				System.out.print(data[i]+" ");
			}
		}

		if(rear<front) {
			for(int i = front ; i<data.length ; i++) {
				System.out.println(data[i]);
			}
			for(int i = 0; i < front-1; i++) {
				System.out.print(data[i]+" ");
			}
		}
		System.out.println();
	}

}
