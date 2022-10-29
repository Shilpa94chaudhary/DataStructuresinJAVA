package Queues;

public class DynamicQueueUse {

	public static void main(String[] args) {
		
		DynamicArrayQueue dQueue = new DynamicArrayQueue();
		
		for(int i = 0 ; i<5 ; i++) {
			dQueue.enqueue(i*5);
			
			System.out.println("Size : " + dQueue.size());
			dQueue.print();
		}
		
		System.out.println("Dequeue : " + dQueue.dequeue());
		System.out.println("Dequeue : " + dQueue.dequeue());
		System.out.println("Size : " + dQueue.size());
		dQueue.print();
		System.out.println("Enqueue : 50");
		dQueue.enqueue(50);
		dQueue.print();
		
		for(int i = 0 ; i<5 ; i++) {
			dQueue.enqueue((i+5)*5);
			System.out.println("Size : " + dQueue.size());
			dQueue.print();
		}
	}

}
