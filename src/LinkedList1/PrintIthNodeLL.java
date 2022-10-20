package LinkedList1;

public class PrintIthNodeLL {

	public static void printIthNode(LinkedListNode<Integer> head, int posn){
		if(head == null) {
			return;
		}
		int i = 0;
		
		while(head != null) {
			if(i==posn) {
				System.out.println(head.data);
			}
			i++;
			head = head.next;
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
		printIthNode(head,3);
		printIthNode(head,0);
		printIthNode(head,7);
		LinkedListNode <Integer> head1=null;
		printIthNode(head1,3);
		
	}
}
