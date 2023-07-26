package circularQueue;

public class CircularQueue {
	private int[] arr;
	private int rear,front;
	public CircularQueue(int size) {
		// TODO Auto-generated constructor stub
		arr=new int[size];
		rear=-1;
		front=-1;
	}
	void push(int value) {
		//it is queue elemnt will be added at last
		if(!isFull()) {
		rear=(rear+1)%(arr.length-1);
		arr[rear]=value;}
		else {
			throw new RuntimeException("queue is empty");
		}
	}
	void pop() {
		if(!isEmpty()) {
		front=(front +1)%(arr.length-1);
		//now to completely delete the queue and stop circular delteion after evry element is deleted
		//apply empty condition i.e
		if(front==rear) {
			front =-1;
			rear=-1;
		}
		}
		else 
			throw new RuntimeException("queue is empty");
	}
	boolean isEmpty() {
		return (front==-1 && rear==-1);
	}
	boolean isFull() {
		return ((front==-1 && rear==arr.length-1) || (front==rear && front!=-1));
	}
	int peek() {
		return arr[front+1];
	}
}
