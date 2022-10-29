package Queues;

public class QueueUsingLL {

	private Node<Integer> front;
	private Node<Integer> rear;
	private int size;
	
	QueueUsingLL(){
		front = null;
		rear = null;
		size = 0;
	}
	
	public void enqueue(int element) {
		Node<Integer> temp = new Node<Integer>(element);
		if(size == 0) {
			front = temp;
			rear = temp;
			size++;
			return;
		}
		rear.next = temp;
		rear = temp;
		size++;
	}
	
	public int dequeue() {
		int temp = front.data;
		front = front.next;
		size--;
		return temp;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void print() {
		Node<Integer> temp = front;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int front() {
		return front.data;
	}
}
