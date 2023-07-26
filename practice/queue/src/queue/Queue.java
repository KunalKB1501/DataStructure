package queue;

public class Queue {
	static class Node{
		private int data;
		private Node next;
		public Node() {
			// TODO Auto-generated constructor stub
			next=null;
		}
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.data=value;
			next=null;
		}
	}
	private Node head;
	private Node tail;
	void push(int value) {
		//add last in  queue
		Node nn=new Node(value);
		if(head==null) {
			head=nn;
			tail=nn;
		}else {
			tail.next=nn;
			tail=nn;
		}
		
	}
	void pop() {
		//delete first in 
		Node temp=head;
		if(head==null) {
			System.out.println("stack is Empty");
		}else {
			head=head.next;
		}
	}
	void peek() {
		System.out.println(head.data);
	}
	boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}
	void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("stack is Empty");
		}else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
}
