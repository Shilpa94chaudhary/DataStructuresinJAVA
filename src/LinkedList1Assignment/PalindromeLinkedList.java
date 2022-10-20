package LinkedList1Assignment;

import java.util.Scanner;

public class PalindromeLinkedList {
	
	// Check if linked list is Palindrome
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return false;
		}
		
		LinkedListNode<Integer> revLL = reverseLL(head);
		while(head != null) {
			if(head.data.equals(revLL.data)) {
				head = head.next;
				revLL = revLL.next;
			}else {
				return false;
			}
		}
		return true;
	}
	
	// Function to reverse Linked List
	public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
		LinkedListNode<Integer> prv = null;
		LinkedListNode<Integer> next = null;
		LinkedListNode<Integer> current = head;
		while(current != null) {
			next = current.next;
			current.next = prv;
			prv = current;
			current = next;
		}
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
		System.out.println(isPalindrome(head));

	}

}
