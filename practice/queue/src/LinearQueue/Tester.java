package LinearQueue;
import queue.Queue.*;
public class Tester {
public static void main(String[] args) {
	LinearQueue s=new LinearQueue(5);
	System.out.println(s.isEmpty());
	s.push(22);
	s.push(11);
	s.push(14);
	s.pop();
	System.out.println(s.peek());
	System.out.println(s.isFull());
	
}
}
