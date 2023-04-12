package Collection;

import java.util.LinkedList;

// remove method combination
public class LinkedListRemove {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Dinesh");
		ll.add("Suraj");
		ll.add("Rita");
		ll.add("Gita");
		ll.add("Nisha");
		ll.add("Reena");
		System.out.println("List 1 elements:"+""+ll);
		LinkedList<String> ll2=new LinkedList<String>();

		ll2.add("Rani");
		ll2.add("Sangita");
		ll2.add("Mukesh");

		System.out.println("List two elements:"+""+ll2);
		//adding new element to the list 
		ll.addAll(ll2);
		System.err.println("After adding new element:"+""+ll);
		//removing specific element from array list
		ll.remove("Rita");
		System.err.println("After removing:"+""+ll);
		//removing specific element on the basic of particular position
		System.err.println("After removing for specific position:"+""+ll);
		//remove all the new element of the list 2
		ll.removeAll(ll2);
		
		System.err.println("After removing all the element:"+""+ll);
		//remove 1st element of the list
		ll.removeFirst();
		System.err.println("After removing 1st  element:"+""+ll);
		//remove last element of the list
		ll.removeLast();
		System.err.println("After removing last  element:"+""+ll);
		//adding new element to the list
		ll.add("Deepak");
		ll.add("Anudip");
		ll.add("java");
		ll.add("Deepak");
		ll.add("Collection");
		System.out.println("updated List elements:"+""+ll2);
		//removing first occurance of element
	}
}
