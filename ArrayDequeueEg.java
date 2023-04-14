package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueEg {
public static void main(String[] args) {
	Deque<String>dq=new ArrayDeque<String>();
	dq.add("Ram");
	dq.add("karan");
	dq.add("Arjun");
	dq.add("Krishna");
	
	dq.add("Rani");
	dq.add("Raja");
	//dq.add(null);//null are not allowed
	System.out.println(dq);
	dq.addFirst("Shree");
	dq.addLast("Radhe");
	System.out.println("new list");
	for(String s1:dq) {
		System.out.println(s1);
	}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("new list after removel");
		for(String s2:dq) {
			System.out.println(s2);
		}}}