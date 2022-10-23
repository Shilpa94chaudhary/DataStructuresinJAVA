package LinkedList2Assignment;

import java.util.Scanner;

public class SwapTwoNodesLL {


	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		if(head == null) {
			return head;
		}
		if(i==j) {
			return head;
		}

		// If user wants to swipe 0th node with any node
		if(i==0) {

			LinkedListNode<Integer> nextNode=null;
			LinkedListNode<Integer> prevNode=null;
			LinkedListNode<Integer> temp=head;

			nextNode = head.next;
			for(int k = 0; k<j ; k++) {
				if(temp == null) {
					return head;
				}
				prevNode = temp;
				temp=temp.next;
			}
			prevNode.next = head;
			head.next = temp.next;
			temp.next = nextNode;
			head = temp;
		}else {
			LinkedListNode<Integer> Node1=null;
			LinkedListNode<Integer> prevNode1=null;
			LinkedListNode<Integer> Node2=null;
			LinkedListNode<Integer> prevNode2=null;
			LinkedListNode<Integer> temp=head;
			for(int k = 0; k<i ; k++) {
				if(temp == null) {
					return null;
				}
				prevNode1 = temp;
				temp = temp.next;
				Node1 = temp;
			}
			temp = head;
			for(int k = 0; k<j ; k++) {
				if(temp == null) {
					return null;
				}
				prevNode2 = temp;
				temp = temp.next;
				Node2 = temp;
			}

			prevNode1.next = Node2;
			prevNode2.next = Node1;

			temp = Node1.next;
			Node1.next = Node2.next;
			Node2.next = temp;

		}


		return head;
	}

	public static void main(String[] args) {
		// 10 22 10 26 11 7 8 1 23 5 1 -1
		LinkedListNode<Integer> head = takeInput();
		head = swapNodes(head,2,5);
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
