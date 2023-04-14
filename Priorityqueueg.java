package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueueg {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<String>();
	queue.add("prakash");
	queue.add("Babai");
	queue.add("Sanjeet");
	queue.add("Hasan");
	queue.add("Bumba");
	queue.add("Owashim");
	queue.add("Tanmoy");
	System.out.println("head:"+queue.element());
	System.out.println("Queue:"+queue);
	System.out.println("head:"+queue.peek());
	System.out.println("Queue:"+queue);
	System.out.println("Iterating the element");
	Iterator itr=queue.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		System.out.println("head:"+queue.poll());
		System.out.println("queue:"+queue);
		System.out.println("head:"+queue.remove());
		System.out.println("Queue:"+queue);
		System.out.println("After removing");
		Iterator itrl=queue.iterator();
		while(itrl.hasNext()) {
			System.out.println(itrl.next());
		}
	}
}
}
