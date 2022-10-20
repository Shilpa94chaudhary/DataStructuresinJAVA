package LinkedList1;

public class IncrementEveryElementLL {


	private static <T> void increment(LinkedListNode<Integer> head) {
		LinkedListNode<Integer>temp = head;
		System.out.println();
		while(temp != null) {
			temp.data ++;
			temp = temp.next;
		}
		
	}
	
	public static <T> void printLL(LinkedListNode<T> head) {
		LinkedListNode<T>temp = head;
		System.out.println();
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		
	}
	
	public static LinkedListNode<Integer> createLL(){
		
		LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(5);
		LinkedListNode<Integer> n2 = new LinkedListNode<Integer>(15);
		LinkedListNode<Integer> n3 = new LinkedListNode<Integer>(25);
		LinkedListNode<Integer> n4 = new LinkedListNode<Integer>(35);
		LinkedListNode<Integer> n5 = new LinkedListNode<Integer>(45);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
	}
	
	public static void main(String[] args) {
		LinkedListNode <Integer> head = createLL();
		printLL(head);
		increment(head);
		printLL(head);
	}

}
