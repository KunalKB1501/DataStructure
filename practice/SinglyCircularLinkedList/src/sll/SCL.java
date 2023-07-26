package sll;

public class SCL {
//inner static class
	static class Node {
		private int data;
		private Node next;

		public Node() {
			// TODO Auto-generated constructor stub
			this.data = 0;
			this.next = null;
		}

		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.data = value;
			this.next = null;
		}
	}

	private Node head;

	// add at first
	// dispaly
	void display() {
		Node temp = head;
		// if list empty return nothing;
		if (head == null)
			return;
		else {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}

	void addAtFirst(int value) {
		Node nn = new Node(value);
		// if list is empty
		Node temp = head;
		if (head == null) {
			head = nn;
			nn.next = head;
		} else {
			while (temp.next != head) {
				temp = temp.next;
			}
			nn.next = head;
			temp.next = nn;
			head = nn;
		}
	}

	void addAtlast(int value) {
		Node nn = new Node(value);
		// traverse till last
		Node temp = head;
		if (head == null) {
			head = nn;
			nn.next = head;
		} else {
			while (temp.next != head) {
				temp = temp.next;
			}
			nn.next = head;
			temp.next = nn;
		}
	}

	void addAtPosition(int value, int position) {
		Node nn = new Node(value);
		Node temp = head;
		if (head == null || position <= 1) {
			head = nn;
			nn.next = head;
		} else {
			for (int i = 1; i < position - 1; i++) {
				if (temp.next == head)// if the iteartion are out of th bound
					break; // add simple terminatating statement checking
				temp = temp.next;
			}
			nn.next = temp.next;
			temp.next = nn;
		}
	}

	void deleteAtPosition(int pos) {
		Node temp = null;
		Node trav = head;
		if (head == null || head.next==head) {
			System.out.println("list is empty");
			head=null;
			return;
		} else {
			for (int i = 1; i < pos; i++) {
				if (trav.next == head) {
					break;
				} else {
					temp = trav;
					trav = trav.next;
				}
			}
			temp.next = trav.next;
		}
	}

	void deleteAll() {
		head.next=null;//also removes all the references
		head = null;
		System.out.println("list deleted");
	}

	void DeleteFirst() {
		Node temp = head;
		if (head == null || head.next == head) {
			System.out.println("list is empty");
			head = null;
		} else {
			while (temp.next != head) {
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
		}
	}
	void deleteLast() {
		Node temp=null;
		Node trav=head;
		if (head == null || head.next == head) {
			System.out.println("list is empty");
			head = null;}
		else {
			while(trav.next!=head) {
				temp=trav;
				trav=trav.next;
			}
			temp.next=head;
		}
	}
}
