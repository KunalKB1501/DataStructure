package singlyLinearLinkedList;

class SinglyList {
	// node is static member clas of singly linked list
	static class Node {
		private int data;
		private Node next;

		public Node() {
			this.data = 0;
			this.next = null;
		}

		public Node(int value) {
			this.data = value;
			this.next = null;
		}

		public int getData() {
			return data;
		}
 
		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	// list class fields
	private Node head;

	public SinglyList() {
		head = null;
	}

	// add methods
	// display
	void display() {
		Node temp = head;
		// System.out.println(temp.data);
		while (temp != null) {
			// System.out.println("in linked list");
			System.out.print(temp.data + " ");
			// initialize the next reference of the node
			temp = temp.next;
		}
	}

	// insert data at first
	void addAtFirst(int value) {
		Node first = new Node(value);
		// make the new node as head and add the next of new node as head
		first.next = head;
		head = first;

	}

	// insert at Last
	void inserAtLast(int value) {
		Node last = new Node(value);
		Node temp = head;
		// if list is empty,then make the last as head/first node
		if (head == null) {
			head = last;
		} else {
			// traverse to the last so you will get refernce of the last
			while (temp.next != null) {
				temp = temp.next;// you will get point to last node refence not to the next of last
			}
			temp.next = last;
		}
	}

	// add at position
	void addAtPosition(int value, int position) {
		Node add = new Node(value);
		Node temp = head;
		if (head == null || position <= 1) {
			addAtFirst(value);
		} else {
			for (int i = 1; i < position - 1; i++) {
				temp = temp.next;
			}
			add.next = temp.next;
			temp.next = add;
		}
	}

	void deleteAtFirst() {
		try {
			if (head == null) {
				throw new RuntimeException("List is Empty");
			} else {
				head = head.next;
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	void deleteAll() {
		head = null;
	}

	void deleteAtLast() {
		// make use of two pointers because you need to modify not the last but the
		// second last one
		Node temp = null;
		Node trav = head;
		// if there is single node
		if (head.next == null) {
			head = null;
		} else {
			while (trav.next != null) {
				// System.out.print(temp.data+" ");
				temp = trav;
				trav = trav.next;
			}
			temp.next = null;
		}
	}

	void deleteAtPosition(int position) {
		Node temp = null, trav = head;
		for (int i = 1; i < position; i++) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
	}
	void sortBySelectionSort() {
		for(Node i=head;i!=null;i=i.next) {
			for(Node j=i.next;j!=null;j=j.next) {
				if(i.data>j.data) {
					int temp=i.data;
					i.data=j.data;
					j.data=temp;
				}
			}
		}
		
	}
	void LinearSearch() {
		
	}
	void reverseLinkedList() {
		Node oldHead=head;
		head=null;
		while(oldHead!=null) {
		//delete first from(temp) oldlist
		Node temp=oldHead;
		oldHead=oldHead.next;
		//add first(temp) to new list
		temp.next=head;
		head=temp;
		}
	}
	void findMiddle() {
		int count=1;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		count=count/2;
		Node trav=head;
		for(int i=1;i<count;i++) {
			trav=trav.next;
		}
		System.out.println("middle no. is :"+trav.data);
	}
	void findMiddleSingleTraverse() {
		Node fast=head;
		Node slow=head;
		while(fast!=null &fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.data);
	}
}

//tester
public class SinglyListMain {
	public static void main(String[] args) {
		SinglyList sl = new SinglyList();
		sl.addAtFirst(22);
		sl.inserAtLast(33);
		sl.addAtFirst(11);
		sl.addAtPosition(15, 2);
		sl.addAtPosition(10, 1);
		sl.sortBySelectionSort();
		sl.display();
		System.out.println();
		sl.reverseLinkedList();
		sl.display();
		System.out.println();
		sl.findMiddle();
		sl.findMiddleSingleTraverse();
//		sl.deleteAtFirst();
//		System.out.println();
//		sl.display();
//		System.out.println();
////		 sl.deleteAll();
//		System.out.println("---------------");
//		sl.deleteAtLast();
//		sl.display();
//		System.out.println("---------------");
//		sl.deleteAtPosition(2);
//		sl.display();
	}
}
