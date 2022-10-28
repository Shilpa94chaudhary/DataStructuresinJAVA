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
		if(front == -1) {
			front = 0;
		}
		if(size==data.length || rear==data.length-1) {
			System.out.println("Queue over flow");
			return;
		}
		data[++rear] = element;
		size++;
	}
	
	public int front() {
		if(front==-1) {
			return -1;
		}else {
			return data[front];
		}
	}
	
	public int dequeue() {
		if(size==0) {
			System.out.println("Queue under flow");
			return -1;
		}else{
			size--;
			return data[front++];
		}
	}
	
}
