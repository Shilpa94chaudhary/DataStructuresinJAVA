package LinkedList2Assignment;

import java.util.Scanner;

public class DeleteEveryNthNodes {

	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		if(head==null) {
			return head;
		}
		
		LinkedListNode<Integer> smallHead = head;
		LinkedListNode<Integer> smallTail = head;
		
		for(int i=0 ; i<M-1; i++){
			if(smallTail.next == null) {
				return head;
			}
			smallTail = smallTail.next;
		}
		
		LinkedListNode<Integer> temp = smallTail;
		for(int i=0 ; i<N; i++){
			if(temp == null) {
				smallTail.next = null;
				return head;
			}
			temp = temp.next;
		}
		
		smallTail.next = skipMdeleteN(temp.next, M,N);
		
		return smallHead;
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		head = skipMdeleteN(head,2,3);
		printRecursive(head);

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

		// Print elements of Linked List
		public static void printRecursive(LinkedListNode<Integer> head) {
			if(head == null) {
				return;
			}
			System.out.print(head.data + " ");
			printRecursive(head.next);
		}

}
