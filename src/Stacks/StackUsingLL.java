package Stacks;

public class StackUsingLL <T> {

	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		this.head = null;
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void push(T element) {
		Node<T> temp = new Node<T>(element);
		temp.next = head;
		head = temp;
		size++;
	}
	
	public T top() throws StackUnderflowException {
		if(head == null) {
			throw new StackUnderflowException();
		}
		return head.data;
	}	

	public T pop() throws StackUnderflowException {
		if(head == null) {
			throw new StackUnderflowException();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	public void print() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
