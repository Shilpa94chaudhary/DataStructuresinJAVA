package LinkedList2Assignment;

import java.util.Scanner;

public class EvenAfterOddLinkedList {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> temp= head, eH = null, oH = null, eT = null, oT = null;
		
		while((eH == null || oH == null) && temp != null) {
			if(temp.data % 2 == 0 && eH == null) {
				eH = temp;
				eT = temp;
			}else if(temp.data % 2 != 0 && oH == null){
				oH = temp;
				oT = temp;
			}
			temp = temp.next;
		}
		
		// If there is only even numbers in LL or only odd numbers in LL
		if(temp == null) {
			return head;
		}
		
		temp = head;
		while(temp != null) {
			if(eT == temp || oT == temp) {
				temp = temp.next;
				continue;
			}
			if(temp.data % 2 == 0) {
				eT.next = temp;
				temp = temp.next;
				eT = eT.next;
			}else {
				oT.next = temp;
				temp = temp.next;
				oT = oT.next;
			}
		}
		oT.next = eH;
		eT.next = null;
		return oH;
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
//		printRecursive(head);
		head = evenAfterOdd(head);
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
