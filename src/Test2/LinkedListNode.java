package Test2;

public class LinkedListNode<T> {
	
	public T data;
	public LinkedListNode<T> next;
	
	LinkedListNode(T data){
		this.data = data;
		next = null;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
