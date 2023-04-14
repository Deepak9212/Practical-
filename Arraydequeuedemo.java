package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydequeuedemo {
public static void main(String[] args) {
	// creating and adding
	Deque<String>deque=new ArrayDeque<String>();
	deque.add("Pallabi");
	deque.add("Sonu");
	deque.add("Raj");
	deque.add("Vikram");
	deque.add("Anju");
	System.out.println("After offer first");
	//traversing
	for(String str:deque) {
		System.out.println(str);}
		
		deque.offerLast("Vidya");
		System.out.println("After offer first");
		//traversing
		for(String strl:deque) {
			System.out.println(strl);}
			//deque.peek & deque.peekfirst same as peek
			System.out.println("peek:"+deque.peek());
			System.out.println("peekfirst:"+deque.peekFirst());
			System.out.println("peek last:"+deque.peekLast());
			System.out.println("After peak");
			for(String strl:deque) {
				System.out.println(strl);}
			
	//deque.poll & deque.pollfirst same as peek
	System.out.println("poll:"+deque.poll());
	System.out.println("poll first:"+deque.pollFirst());
	System.out.println("poll last:"+deque.pollLast());
	System.out.println("After poll");
	for(String str2:deque) {
		System.out.println(str2);
		}
		
	}
}


