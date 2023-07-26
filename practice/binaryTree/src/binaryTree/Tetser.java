package binaryTree;

public class Tetser {
public static void main(String[] args) {
	BinarySearchTree b=new BinarySearchTree();
	b.addNode(45);
	b.addNode(11);
	b.addNode(98);
	System.out.println();
	b.post();
	System.out.println();
	b.pre();
	System.out.println();
	b.in();
	System.out.println("max element in teree is ");
	b.max();
	System.out.println("minimun element is ");
	b.min();
}
}
