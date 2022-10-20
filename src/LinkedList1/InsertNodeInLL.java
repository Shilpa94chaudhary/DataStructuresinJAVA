package LinkedList1;

import java.util.Scanner;

public class InsertNodeInLL {

	// Insert into Linked List
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		if(head == null && pos>0) {
			return null;
		}
		
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> previousNode=head;
		for(int i=0; i<pos ; i++) {
			if(temp==null){
				// If index is greater than the size + 1, then return head, no change in LL
                return head;
            }
			previousNode= temp;
			temp = temp.next;
		}
		previousNode.next = newNode;
		newNode.next = temp;
		
		return head;
	}
	
	// Create a Linked List
	public static LinkedListNode<Integer> takeInput(){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		
		while(data != -1) {
			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = currentNode;
				tail = head;
			}else {
				tail.next = currentNode;
				tail = currentNode;
			}
			 data = s.nextInt();
		}
		
		return head;
	}
	
	// Print a Linked List
	public static <T> void printLL(LinkedListNode<T> head) {
		LinkedListNode<T>temp = head;
		System.out.println();
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		printLL(head);
		
		head = insert(head, 0, 10);
		printLL(head);
		
		

	}

}
