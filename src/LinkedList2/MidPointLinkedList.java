package LinkedList2;

import java.util.Scanner;

public class MidPointLinkedList {

	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
		if(head == null || head.next == null || head.next.next == null) {
			return head;
		}
		LinkedListNode<Integer> slowNode = head;
		LinkedListNode<Integer> fastNode = head;
		while(fastNode.next != null && fastNode.next.next != null) {
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
		}
		return slowNode;
    }
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		LinkedListNode<Integer> mid = midPoint(head);
		if(mid != null) {
			System.out.println(mid.data);
		}
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
