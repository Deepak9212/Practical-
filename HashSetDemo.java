package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
public static void main(String[] args) {
	//creating Hash set and adding elements
	HashSet<String> set=new HashSet<String>();
	set.add("Raj");
	set.add("Ram");
	set.add("Rani");
	set.add("Rakesh");
	set.add("Ranju");
	System.out.println("Original list:"+set);
	//removing specific element from hash set
	set.remove("Raj");
	System.out.println("After invoking remove:"+set);
	HashSet<String>setl=new HashSet();//set 2
	setl.add("sonu");
	setl.add("soni");
	System.out.println("new set:"+setl);
	set.addAll(setl);
	System.out.println("updated list:"+set);
	//remove all the new element
	set.removeAll(setl);
	//remove all
	set.clear();
	System.out.println("present list:"+set);
	
	
	
}
}
