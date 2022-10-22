package LinkedList2;

import java.util.Scanner;

public class MergeTwoSortedLL {

	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		LinkedListNode<Integer> newHead = null;
		if(head1.data<head2.data) {
			newHead = head1;
			head1 = head1.next;
		}else {
			newHead = head2;
			head2 = head2.next;
		}
		LinkedListNode<Integer> temp = newHead;
		while(head1 != null && head2 != null) {
			if(head1.data<head2.data) {
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;
			}else {
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;
			}
		}
		
		if(head1 != null) {
			temp.next = head1;
		}else if(head2 != null) {
			temp.next = head2;
		}
		return newHead;
	}


	public static void main(String[] args) {
		LinkedListNode<Integer> head1 = takeInput();
		LinkedListNode<Integer> head2 = takeInput();
		LinkedListNode<Integer> head = mergeTwoSortedLinkedLists(head1, head2);
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
