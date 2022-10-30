package Test2;


public class NextNumber {

	// Not applicable for large LL
//	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head){
//		if(head == null) {
//			return head;
//		}
//		int num = 0;
//		
//		while(head != null) {
//			int n = head.data;
//			num = num*10 + n;
//			head = head.next;
//		}
//		System.out.println(num);
//		num++;
//		int n = num%10;
//		num = num/10;
//		LinkedListNode<Integer> newHead = new LinkedListNode<Integer>(n);
//		while(num != 0) {
//			n = num%10;
//			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(n);
//			currentNode.next = newHead;
//			newHead = currentNode;
//			num = num/10;
//		}
//		return newHead;
//	}
	
	
	// Without using reverse LL function
//	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head){
//		if(head == null) {
//			return head;
//		}
//		
//		LinkedListNode<Integer> revLL = new LinkedListNode<Integer>(head.data);
//		head = head.next;
//		
//		while(head != null) {
//			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(head.data);
//			currentNode.next = revLL;
//			revLL = currentNode;
//			head = head.next;
//		}
//		int carry = 1;
//		int sum;
//		LinkedListNode<Integer> temp = revLL;
//		while(temp != null) {
//			sum = carry + temp.data;
//			carry = (sum>=10)? 1 : 0;
//			sum = sum % 10;
//			temp.data = sum;
//			temp = temp.next;
//		}
//		
//		LinkedListNode<Integer> newHead = new LinkedListNode<Integer>(revLL.data);
//		revLL = revLL.next;
//		
//		while(revLL != null) {
//			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(revLL.data);
//			currentNode.next = newHead;
//			newHead = currentNode;
//			revLL = revLL.next;
//		}
//		if(carry == 1){
//            LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(carry);
//            currentNode.next = newHead;
//            newHead = currentNode;
//        }
//
//		return newHead;
//	}
		
		
		
		public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head){
			if(head == null) {
				return head;
			}
			
		head = reverse(head);
		
		int carry = 1;
		int sum;
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			sum = carry + temp.data;
			carry = (sum>=10)? 1 : 0;
			sum = sum % 10;
			temp.data = sum;
			temp = temp.next;
		}
		
		
		head = reverse(head);
		
		if(carry == 1){
            LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(carry);
            currentNode.next = head;
            head = currentNode;
        }
		
		return head;
	}
	
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head)
    {
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
	
	public static void printRecursive(LinkedListNode<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRecursive(head.next);
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(9);
		LinkedListNode<Integer> tail = head;
		for(int i=0 ; i<2 ; i++) {
			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(9);
			tail.next = currentNode;
			tail = currentNode;
		}
		System.out.println("Linked List: ");
		printRecursive(head);
		head = nextLargeNumber(head);
		System.out.println("\nLinked List after adding one: ");
		printRecursive(head);
	}
}
