package LinkedList1;

import java.util.Scanner;

public class DeleteNodeInLL {

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int index) {
		if(head == null) {
			return null;
		}
		
		if(index == 0) {
			head = head.next;
			return head;
		}
		LinkedListNode<Integer> prevNode = head;
		for(int i=0; i<index-1; i++) {
			if(prevNode.next == null) {
				return head;
			}
			prevNode = prevNode.next;
		}
		if(prevNode.next == null) {
			return head;
		}
		prevNode.next = prevNode.next.next;
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
			head = deleteNode(head, 5);
			printLL(head);

		}

}
