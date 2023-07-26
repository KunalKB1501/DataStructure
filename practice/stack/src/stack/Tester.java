package stack;
import stack.Stack.*;
public class Tester {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(22);
	s.push(11);
	s.display();
	System.out.println();
	s.pop();
	s.display();
	s.peek();
	System.out.println(s.isEmpty());
}
}
