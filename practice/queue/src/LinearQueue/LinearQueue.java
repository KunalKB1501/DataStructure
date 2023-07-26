package LinearQueue;

public class LinearQueue {
	private int[] arr;
	private int rear,front;
	public LinearQueue(int size) {
		// TODO Auto-generated constructor stub
		arr=new int[size];
		rear=-1;
		front=-1;
	}
	void push(int value) {
		//it is queue elemnt will be added at last
		if(!isFull()) {
		rear++;
		arr[rear]=value;}
		else {
			throw new RuntimeException("queue is empty");
		}
	}
	void pop() {
		if(!isEmpty()) {
		front++;
		System.out.println("element pop is "+arr[front]);}
		else
			throw new RuntimeException("queue is empty");
	}
	boolean isEmpty() {
		return rear==front;
	}
	boolean isFull() {
		return rear==arr.length-1;
	}
	int peek() {
		return arr[front+1];
	}
}
