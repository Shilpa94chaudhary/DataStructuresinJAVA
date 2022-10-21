package LinkedList2;

import java.util.Scanner;

public class ReverseLL {


	public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {
		if(head == null) {
			return head;
		}
		if(head.next ==null) {
			return head;
		}
		LinkedListNode<Integer> newHead = reverseLL(head.next);
		LinkedListNode<Integer> tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {

		LinkedListNode<Integer> head = takeInput();
		head = reverseLL(head);
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
