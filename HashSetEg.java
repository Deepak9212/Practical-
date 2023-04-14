package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {
//allowing null value
	public static void main(String[] args) {
		Set<String> s4=new HashSet<String>();
		s4.add("Ac");
		s4.add("Tv");
		s4.add("BB");
		s4.add("Mouse");
		s4.add("Pen");
		s4.add(null);
		s4.add("Car");
		s4.add("Motor");
		s4.add("Bottle");
		Iterator<String> itr=s4.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
