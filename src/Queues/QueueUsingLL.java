package Queues;

public class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	QueueUsingLL(){
		front = null;
		rear = null;
		size = 0;
	}
	
	public void enqueue(T element) {
		Node<T> temp = new Node<T>(element);
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
	
	public T dequeue() {
		if(size == 0){
            return null;
        }
		T temp = front.data;
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
		Node<T> temp = front;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public T front() {
		return front.data;
	}
}
