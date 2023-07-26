package stackusingarray;

import java.util.Arrays;

public class StackArr {
	private int [] arr;
	private int top;
	public StackArr(int size) {
		// TODO Auto-generated constructor stub
		arr=new int[size];
		top=-1;
		
	}
	public void push(int value) {
		if(!isFull()) {
		top++;
		arr[top]=value;}
		else
			System.out.println("Stack is Full");
	}
	public void pop() {
		if(!isEmpty())
		top--;
		else
			System.out.println("stack is Empty");
	}
	public void peek() {
		if(!isEmpty())
		System.out.println("top elemnet is :"+arr[top]);
		else
			System.out.println("stack is Empty");
	}
	public boolean isEmpty() {
		if(top<0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public void display() {
		System.out.println(Arrays.toString(arr));
	}
}
