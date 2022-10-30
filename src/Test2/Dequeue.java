package Test2;

public class Dequeue {
	int data[];
	int front;
	int rear;
	int size;

	Dequeue(int size){
		data = new int [size];
		front = -1;
		rear = -1;
		size = 0;
	}

	public void insertFront(int element) {
		if(size == data.length) {
			System.out.println("-1");
			return;
		}

		if(size==0) {
			front = 0;
			rear = 0;
		}else if(front == 0) {
			front = data.length-1;
		}else {
			front--;
		}

		data[front] = element;
		size++;
	}

	public void insertRear(int element){
		if(size == data.length) {
			System.out.println("-1");
			return;
		}

		if(size==0) {
			front = 0;
			rear = 0;
		}else if(rear == data.length-1) {
			rear = 0;
		}else {
			rear++;
		}
		data[rear] = element;
		size++;
	}

	public void deleteFront(){
		if(size==0) {
			System.out.println("-1");
			return;
		}
		if(front == data.length-1) {
			front = 0;
		}else {
			front++;
		}
		size--;
	}

	public void deleteRear(){
		if(size==0) {
			System.out.println("-1");
			return;
		}
		if(rear == 0) {
			rear = data.length-1;
		}else {
			rear--;
		}
		size--;
	}
	
	 public int getFront(){
		 if(size==0) {
			 return -1;
		 }
		 return data[front];
	 }
	 
	 public int getRear(){
		 if(size==0) {
			 return -1;
		 }
		 return data[rear];
	 }
}
