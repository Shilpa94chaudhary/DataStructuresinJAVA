package LinkedList2Assignment;

import java.util.Scanner;

public class FindNodeLLRecursive {

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
		if(head == null) {
			return -1;
		}
		if(n == head.data) {
			return 0;
		}
		int result = findNodeRec(head.next, n);
		if(result != -1) {
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		System.out.println(findNodeRec(head,-34));
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
