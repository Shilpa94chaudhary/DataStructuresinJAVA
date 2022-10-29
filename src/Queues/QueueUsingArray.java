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

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(int element) {
		if(size == 0) {
			front = 0;
		}
		if(size==data.length || rear==data.length-1) {
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

	public int front() {
		if(size  == 0) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			return data[front];
		}
	}

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

}
