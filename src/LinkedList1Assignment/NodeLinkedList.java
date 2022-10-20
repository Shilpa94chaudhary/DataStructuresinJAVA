package LinkedList1Assignment;

public class NodeLinkedList {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		if(head == null) {
			return -1;
		}
		LinkedListNode<Integer> temp = head;
		int i = 0;
		while(temp.next != null) {
			if(temp.data == n) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;
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
		System.out.println(findNode(head,15));
		LinkedListNode <Integer> head1=null;
		System.out.println(findNode(head1,2));
	}
}
