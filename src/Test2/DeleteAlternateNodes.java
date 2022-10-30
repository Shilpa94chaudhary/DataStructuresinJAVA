package Test2;

public class DeleteAlternateNodes {
	
	public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
		if(head == null) {
			return;
		}
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			if(temp.next == null) {
				return;
			}else if(temp.next.next == null) {
				temp.next = null;
				return;
			}
			temp.next = temp.next.next;
			temp = temp.next;
		}
	}

	public static void printRecursive(LinkedListNode<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRecursive(head.next);
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(5);
		LinkedListNode<Integer> tail = head;
		for(int i=1 ; i<5 ; i++) {
			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(i*5);
			tail.next = currentNode;
			tail = currentNode;
		}
		printRecursive(head);
		System.out.println();
		deleteAlternateNodes(head);
		printRecursive(head);
	}

}
