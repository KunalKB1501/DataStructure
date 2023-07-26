package doublycircular;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DCL d=new DCL();
		d.addLast(11);
		d.addLast(10);
		d.addLast(9);
		d.addFirst(1);
		d.addPos(15, 3);
		d.display();
		System.out.println();
		d.deletePos(3);
		d.display();
		

	}

}
