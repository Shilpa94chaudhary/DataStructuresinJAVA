package LinkedList1Assignment;

import java.util.Scanner;

public class EliminateDuplicatesFromLL {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		if(head==null)
            return head;
        if(head.next==null)
            return head;
        LinkedListNode<Integer> t1=head,t2=head.next;
        LinkedListNode<Integer> finalhead=head;
        while(t2!=null){
            if(t1.data.equals(t2.data))
            {
                t2=t2.next; 
            }
            else{
                t1.next=t2;
                t1=t2;
            }
        }

        t1.next=null;
        return finalhead;
	}
	
//	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
//		//Your code goes here
//       if(head == null || head.next == null) {
//			return head;
//		}
//		LinkedListNode<Integer> tempHead = head;
//		LinkedListNode<Integer> tail = head;
//		
//		while(head != null) {
//			if(tail.data == head.data){
//				head = head.next;
//			}else {
//				tail.next = head;
//				tail = head;
//			}
//		}
//		tail.next = null;
//		return tempHead;
//	}


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
		head = removeDuplicates(head);
		printLL(head);

	}

}
