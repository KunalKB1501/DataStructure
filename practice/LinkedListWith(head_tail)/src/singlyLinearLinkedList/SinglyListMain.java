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
	private Node tail;

	public SinglyList() {
		this.head = null;
		this.tail = null;
	}

	// add methods
	// display
	void display() {
		Node temp = head;
		// System.out.println(temp.data);
		if (head == null) {
			System.out.println("List is empty.");
		} else {
			while (temp != null) {
				// System.out.println("in linked list");
				System.out.print(temp.data + " ");
				// initialize the next reference of the node
				temp = temp.next;
			}
		}
	}

	// insert data at first
	void addAtFirst(int value) {
		Node first = new Node(value);
		// make the new node as head and add the next of new node as head
		first.next = head;
		head = first;
		// specail case if list is empty then new node is the last node also
		if (tail == null)
			tail = first;
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

	void insertAtLasttail(int value) {
		Node nn = new Node(value);
		// If list is empty
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			tail.next = nn;
			// Update tail to new node
			tail = nn;
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
}

//tester
public class SinglyListMain {
	public static void main(String[] args) {


		SinglyList sl = new SinglyList();
		sl.addAtFirst(22); // Add first element
		sl.addAtFirst(11); // Add second element at first
		sl.addAtPosition(15, 2); // Add third element at second position
		sl.addAtPosition(10, 1); // Add fourth element at first position
		sl.insertAtLasttail(75); // Add fifth element at the last (tail) position
		sl.display(); // Display the list
	}
}
