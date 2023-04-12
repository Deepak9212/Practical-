package Collection;

import java.util.LinkedList;

public class linkedListMethod {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Dk");
	ll.add("SK");
	ll.add("Rita");
	ll.add("Gita");
	ll.add("Nisha");
	ll.add("Reena");
	System.out.println("List 1 elements:"+""+ll);
	//retrieve the 1st element of the list --by default
	System.out.println(ll.peek());
 //retrieve the 1st element of the list
	System.out.println(ll.peekFirst());
	//retrieve the last element of the list
	System.out.println(ll.peekLast());
	//retrieve and remove the 1st element of the list --by default
	System.out.println(ll.poll());
	System.out.println("List 1 element:"+""+ll);
	//retrieve the first element of the list
	System.out.println(ll.pollFirst());
	System.out.println("List 1 element:"+""+ll);
	//retrieve the first element of the list
	System.out.println(ll.pollLast());
	System.out.println("List 1 element:"+""+ll);
	System.out.println(ll.pop());
	System.out.println("List 1 element:"+""+ll);
	
	
	
	
}
}
