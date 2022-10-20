package LinkedList1Assignment;

public class AppendLastNToFirst {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> root, int n) {
		if(root == null){
	         return null;
	     }
		if(n==0) {
			return root;
		}
		LinkedListNode<Integer> temp = root;
		LinkedListNode<Integer> head = null;
		
		int size = getSize(root);
		int x = size-n;
		
		for(int i = 1; i <= x ; i++) {
			if(temp == null) {
				return null;
			}
			temp = temp.next;
		}
		
		head = temp;
		
		for(int i = 1; i < n ; i++) {
			temp = temp.next;
		}
		
		temp.next = root;
		LinkedListNode<Integer> temp1 = root;
		
		for(int i = 1; i< x ; i++) {
			temp1 = temp1.next;
		}
		temp1.next = null;
		
		return head;
	}
	
	private static int getSize(LinkedListNode<Integer> root) {
		int i = 0;
		LinkedListNode<Integer> temp = root;
		while(temp != null) {
			i++;
			temp = temp.next;
		}
		return i;
	}

	public static <T> void printLL(LinkedListNode<T> head) {
		LinkedListNode<T>temp = head;
		System.out.println();
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		
	}
	
	public static LinkedListNode<Integer> createLL(){
		
		LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(5);
		LinkedListNode<Integer> n2 = new LinkedListNode<Integer>(15);
		LinkedListNode<Integer> n3 = new LinkedListNode<Integer>(25);
		LinkedListNode<Integer> n4 = new LinkedListNode<Integer>(35);
		LinkedListNode<Integer> n5 = new LinkedListNode<Integer>(45);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
	}
	
	public static void main(String[] args) {
		LinkedListNode <Integer> head = createLL();
		printLL(head);
		head = appendLastNToFirst(head,3);
		printLL(head);
	}

}
