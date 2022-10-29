package Queues;

public class FibonacciFunction {

	public static void printFibonacci(int n) {
		QueueUsingArray q = new QueueUsingArray();
	    q.enqueue(0);
	    q.enqueue(1);
	    for (int i = 0; i < n; i++)
	    {
	        int a = q.dequeue();
	        int b = q.dequeue();
	        q.enqueue(b);
//	        System.out.println(q.front());
	        q.enqueue(a + b);
	        System.out.print(a + " ");
	    }
	}
	
	public static void main(String[] args) {
		
		printFibonacci(5);

	}

}
