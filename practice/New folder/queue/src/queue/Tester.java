package queue;
import queue.Queue.*;
public class Tester {
public static void main(String[] args) {
	Queue s=new Queue();
	s.push(22);
	s.push(11);
	s.display();
	System.out.println();
	s.pop();
	s.display();
	System.out.println();
	s.peek();
}
}
