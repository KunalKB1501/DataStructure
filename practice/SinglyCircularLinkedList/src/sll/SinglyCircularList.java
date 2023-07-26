package sll;
import static sll.SCL.*;
@SuppressWarnings("unused")
public class SinglyCircularList {
	public static void main(String[] args) {
		SCL s=new SCL();	
		s.addAtFirst(22);
		s.addAtlast(33);
		s.addAtlast(44);
		s.addAtFirst(11);
		s.addAtPosition(88, 3);
		s.deleteAtPosition(3);
		s.display();
		System.out.println();
		s.DeleteFirst();
		s.display();
		System.out.println();
		s.deleteLast();
		s.display();
	}

}
