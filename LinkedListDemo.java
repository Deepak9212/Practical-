package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Deepak");
		ll.add("Anudip");
		System.out.println("After adding:");
		//adding an element at the specific position
		ll.add(1,"Riya");
		LinkedList<String> lll=new LinkedList<String>();
		lll.add("aa");
		lll.add("bb");
		//adding 2nd list number to 1st list 
		ll.addAll(lll);
		//adding 2nd list element to the 1st list at specific positions
		ll.addAll(1,lll);
		//Adding an element at the first position
		ll.addFirst("Skill");
		//Adding an element at the last position
		ll.addLast("Development");
		//removing specific element from arraylist
		ll.remove("Deepak");
		//removing specific element on the basic of particular position
		ll.remove(1);
		//remove all the new element
		ll.removeAll(lll);
		//remove first element of the list
		ll.removeFirst();
		//remove last element of the list
		ll.removeLast();
		//remove first occurrence of element
		ll.removeFirstOccurrence("Deepak");
		//remove last occurrence of element
				ll.removeLastOccurrence("Deepak");
				//remove all the element
				ll.clear();
				Iterator<String> itr=ll.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
					//Traversing the list of elements in reverse order
					Iterator i=ll.descendingIterator();
					while(i.hasNext()) {
						System.out.println(i.next());
					}}
				}
}
