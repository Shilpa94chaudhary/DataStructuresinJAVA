package LinkedList1;

public class GenericLinkedListUse {

	public static GenericNode<Integer> createLL(){
		GenericNode<Integer> n1 = new GenericNode<Integer>(5);
		GenericNode<Integer> n2 = new GenericNode<Integer>(15);
		GenericNode<Integer> n3 = new GenericNode<Integer>(25);
		GenericNode<Integer> n4 = new GenericNode<Integer>(35);
		GenericNode<Integer> n5 = new GenericNode<Integer>(45);
		n1.nextNode = n2;
		n2.nextNode = n3;
		n3.nextNode = n4;
		n4.nextNode = n5;
		
		return n1;
	}
	
	
	public static <T> void print(GenericNode<T> head) {
		System.out.println(head.data);
		System.out.println(head.nextNode.data);
		System.out.println(head.nextNode.nextNode.data);
		System.out.println(head.nextNode.nextNode.nextNode.data);
		System.out.println(head.nextNode.nextNode.nextNode.nextNode.data);
	}
	
	
	public static <T> void printLL(GenericNode<T> head) {
		GenericNode<T>temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
	}
	
	public static void main(String[] args) {
		
		GenericNode <String> gNode1 = new GenericNode <String> ("Hello");
		System.out.println(gNode1.data);
		System.out.println(gNode1.nextNode);

		GenericNode <Integer> gNode2 = new GenericNode <Integer> (10);
		System.out.println(gNode2.data);
		System.out.println(gNode2.nextNode);
		
		GenericNode <Integer> head1 = createLL();
		print(head1);
		printLL(head1);
		
	}

}
