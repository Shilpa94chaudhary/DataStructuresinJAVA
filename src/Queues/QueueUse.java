package Queues;

public class QueueUse {

	public static void main(String[] args) {
		
		QueueUsingArray queue = new QueueUsingArray();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.front());
		System.out.println(queue.dequeue());
		System.out.println(queue.front());
	}

}
