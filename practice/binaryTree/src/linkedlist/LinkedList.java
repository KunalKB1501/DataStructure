package linkedlist;

import java.util.Arrays;

public class LinkedList<T> {
static class Node<T>{
	private T data;
	private Node<T> next;
	public Node() {
		// TODO Auto-generated constructor stub
		next=null;
	}
	public Node(T data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		next=null;
	}
}
private Node<T> head;
int count;

void display() {
	Node<T> temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
		
	}
}
void addAtLast(T e) {
	Node<T> nn=new Node<T>(e);
	if(head==null) {
		head=nn;
	}else {
		Node<T> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=nn;
	}
	count++;
}
 int length() {
	 return count;
 }

//sorted an list
 void sorting(LinkedList<T>list) {
	 Object arr[]=new Object[count];
	 Node<T> temp=head;
 	for(Node<T> i=temp;i!=null;i=temp.next) {
 		for(int j=0;j<count;j++) {
 			arr[j]=i;
 			//break;
 		}
 	}
 	LinkedList<T>list=Arrays.asList(arr);
 }
}
