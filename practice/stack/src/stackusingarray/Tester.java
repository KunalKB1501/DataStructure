package stackusingarray;

public class Tester {
	public static void main(String[] args) {
		StackArr s=new StackArr(5);
		s.push(4);
		s.push(1);
		s.push(3);
		s.push(5);
		s.push(10);
		s.display();
		System.out.println(s.isFull());
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.display();
		
	}

}
