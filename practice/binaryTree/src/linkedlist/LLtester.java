package linkedlist;

import java.util.Scanner;

public class LLtester {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		LinkedList<Student> ll=new LinkedList<Student>();
		Student s=new Student(1, "utkarsh", 24, "kunalBhangale09@gmail.com");
		Student s1=new Student(12, "darshan", 20, "kunalBhangale09@gmail.com");
		ll.addAtLast(s);
		ll.addAtLast(s1);
		ll.display();
		//ll.sorting(ll);
	}

}
