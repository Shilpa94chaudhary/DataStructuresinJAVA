package Queues;

public class LLQueueUse {

	public static void main(String[] args) {
		
		QueueUsingLL LLQueue = new QueueUsingLL();
		LLQueue.enqueue(10);
		LLQueue.enqueue(20);
		LLQueue.enqueue(30);
		LLQueue.enqueue(40);
		
		System.out.println(LLQueue.size());
		System.out.println(LLQueue.isEmpty());
		LLQueue.print();
		System.out.println(LLQueue.front());
		System.out.println(LLQueue.dequeue());
		System.out.println(LLQueue.front());
		System.out.println(LLQueue.size());
		
		LLQueue.print();
	}

}
