package Test2;

public class NextNumber {

	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head){
		if(head == null) {
			return head;
		}
		int num = 0;
		
		while(head != null) {
			int n = head.data;
			num = num*10 + n;
			head = head.next;
		}
		System.out.println(num);
		num++;
		int n = num%10;
		num = num/10;
		LinkedListNode<Integer> newHead = new LinkedListNode<Integer>(n);
		while(num != 0) {
			n = num%10;
			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(n);
			currentNode.next = newHead;
			newHead = currentNode;
			num = num/10;
		}
		return newHead;
	}
	
	public static void printRecursive(LinkedListNode<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRecursive(head.next);
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(3);
		LinkedListNode<Integer> tail = head;
		for(int i=0 ; i<2 ; i++) {
			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(3);
			tail.next = currentNode;
			tail = currentNode;
		}
		head = nextLargeNumber(head);
		printRecursive(head);
	}
}
