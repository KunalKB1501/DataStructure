package doublycircular;

public class DCL {
	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node() {
			// TODO Auto-generated constructor stub
			next = null;
			prev = null;
		}

		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.data = value;
			next = null;
			prev = null;
		}
	}

	private Node head;

	void addLast(int value) {
		Node nn = new Node(value);
		if (head == null) {
			nn.next = nn.prev = nn;
			head = nn;
		} else {
			Node last=head;
			// last element
			while(last.next!=head) {
				last=last.next;
			}
			// insert new node
			nn.next = head;
			head.prev = nn;
			nn.prev = last;
			last.next = nn;
		}
	}

	void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		} else {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp!= head);
		}
	}
	void addFirst(int value) {
		Node nn = new Node(value);
		if (head == null) {
			nn.next = nn.prev = nn;
			head = nn;
		} else {
			Node last=head;
			// last element
			while(last.next!=head) {
				last=last.next;
			}
			// insert new node
			nn.next = head;
			head.prev = nn;
			nn.prev = last;
			last.next = nn;
			head=nn;
		}
	}
	void addPos(int value,int pos) {
		Node nn = new Node(value);
		if (head == null || pos<1) {
			nn.next = nn.prev = nn;
			head = nn;
			return;
		} else {
			Node temp=null;
			Node trav=head;
			for(int i=1;i<pos;i++) {
				if(trav.next==head)
					break;
				temp=trav;
				trav=trav.next;
			}
			nn.prev=temp;
			nn.next=trav;
			temp.next=nn;
			trav.prev=nn;
			
		}
	}
	void deletePos(int pos) {
		if (head == null || pos<1) {
			System.out.println("list is empty");
			return;
		} else {
			Node temp=null;
			Node trav=head;
			for(int i=1;i<pos;i++) {
				if(trav.next==head)
					break;
				temp=trav;
				trav=trav.next;
			}
			Node temp2=trav.next;
			temp2.prev=temp;
			temp.next=temp2;
			
		}
	}
}
