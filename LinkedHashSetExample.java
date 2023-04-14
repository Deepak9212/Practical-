package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
//allowing null method
	public static void main(String[] args) {
	Set<String> s=new LinkedHashSet<String>();
	s.add("Pencil");
	s.add("Tv");
	s.add("Bat");
	s.add("Men");
	s.add("Peacock");
	s.add(null);
	s.add("Camera");
	s.add("Mango");
	s.add("Bag");
	s.add("Pen");
	Iterator<String> itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
