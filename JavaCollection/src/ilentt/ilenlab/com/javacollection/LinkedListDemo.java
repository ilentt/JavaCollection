package ilentt.ilenlab.com.javacollection;
import java.util.LinkedList;

public class LinkedListDemo {

	public LinkedListDemo() {
		// constructor
	}
	
	public void LinkedList() {
		// init a linked list
		LinkedList<String> lstString = new LinkedList<String>();
		lstString.add("I");
		lstString.add("L");
		lstString.add("E");
		lstString.add("N");
		lstString.add("T");
		lstString.add("T");
		System.out.println("Original string: " + lstString);
		
		// remove I element
		lstString.remove("I");
		// remove at index 2
		lstString.remove(2);
		System.out.println("String after delete: " + lstString);
		
		// remove element at first and last position
		lstString.removeFirst();
		lstString.removeLast();
		System.out.println("String after remove first and last: "+lstString);
		
		// set value element at index 2
		//Object obj = lstString.get(1);
		lstString.set(1, "new value");
		System.out.println("List after change: " + lstString);
		
		System.out.println("Value at index 2: " + lstString.get(1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo l = new LinkedListDemo();
		l.LinkedList();
	}

}
