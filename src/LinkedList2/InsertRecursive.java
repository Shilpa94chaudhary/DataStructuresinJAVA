package LinkedList2;

import java.util.Scanner;

public class InsertRecursive {

	// Insert in Linked List
	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
		if(head == null && pos>0) {
			return head;
		}
		
		if(pos == 0) {
			 LinkedListNode<Integer> temp = new LinkedListNode<Integer>(data);
			 temp.next = head;
			 return temp;
		}
		
		head.next = insertR(head.next, data, pos-1);
		
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
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		head = insertR(head,20,2);
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

}
