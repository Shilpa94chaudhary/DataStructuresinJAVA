package LinkedList2;

import java.util.Scanner;

public class MergeSortLL {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {


		return null;
	}

	public static void main(String[] args) {

		LinkedListNode<Integer> head = takeInput();
		head = mergeSort(head);
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
