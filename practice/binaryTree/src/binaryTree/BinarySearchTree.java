package binaryTree;

public class BinarySearchTree {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
			// TODO Auto-generated constructor stub
			left = right = null;
		}

		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.data = value;
			left = right = null;
		}
	}

	private Node root;

	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	// traverse
	void displaypre(Node node) {
		if (node == null) {
			return;
		}
			System.out.print(node.data + " ");
			displaypre(node.left);
			displaypre(node.right);
	}
	void displaypos(Node node) {
		if (node == null) {
			return;
		}
			displaypos(node.left);
			displaypos(node.right);
			System.out.print(node.data + " ");		
	}
	void displayin(Node node) {
		if (node == null) {
			return;
		}
			displayin(node.left);
			System.out.print(node.data + " ");	
			displayin(node.right);	
	}
	void max() {
		Node node=root;
		if(node==null) {
			System.out.println("tree is empty");
		}
		else {
			while(node.right!=null)
			{
				node=node.right;
			}
			
		}
		System.out.println(node.data);
	}
	void min() {
		Node node=root;
		if(node==null) {
			System.out.println("tree is empty");
		}
		else {
			while(node.left!=null)
			{
				node=node.left;
			}
			
		}
		System.out.println(node.data);
	}
	void post() {
		displaypos(root);
	}
	void pre() {
		displaypre(root);
	}
	void in() {
		displayin(root);
	}
	void addNode(int value) {
		// create a new node
		Node nn = new Node(value);
		// check if it is less/greater than root
		// also check whetherroot is null if root is null declare the new node as root;
		if (root == null) {
			root = nn;
		} else {
			// first check whether it is equal to root if it is null break the chain
			// else check whether it is lesser or greater
			// if lesser shift to the left of node otherwise shift to the right of root
			Node temp = root;
			while (true) {
				if (value < temp.data) {
					if (temp.left == null) {
						temp.left = nn;
						break;
					} else
						temp = temp.left;
				} else {
					if (temp.right == null) {
						temp.right = nn;
						break;
					} else {
						temp = temp.right;
					}
				}
			}
		}
	}

}
