package LinkedList1;

import java.util.Scanner;

public class LinkedListUse {

	public static Node createLinkedList(){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Head Element");
		int data = s.nextInt();
		
		Node head = new Node(data);
		
		System.out.println("Want to add one more node");
		char ch = s.next().charAt(0);
		Node tail = head;
		
		while(ch == 'y' || ch == 'Y') {
			System.out.println("Enter next element");
			data = s.nextInt();
			Node temp = new Node(data);
			tail.next = temp;
			tail = temp;
			System.out.println("Want to add one more node");
			ch = s.next().charAt(0);
		}
		return head;
	}
	
	public static void printLinkedList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		
		Node n1 = new Node(10);
		System.out.println(n1.data);
		System.out.println(n1.next);
		
		GenericNode<Integer> n2 = new GenericNode<Integer>(5);
		System.out.println(n2.data);
		System.out.println(n2.nextNode);
		
		Node head = createLinkedList();
		printLinkedList(head);
		
	}

}
