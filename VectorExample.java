package Collection;

import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	//creating vector
	Vector<String> vc=new Vector<String>();
	//Adding element to a vector
	vc.add("Cat");
	vc.add("Dog");
	vc.add("Tiger");
	//vc.add("Lion");
	//checking size and capacity
	System.out.println("Size:"+vc.size());
	System.out.println("Capacity:"+vc.capacity());// old cap *3/2 +l
	//add more elements
	vc.addElement("Cow");
	vc.addElement("Horse");
	System.out.println("After adding elements:");
	System.out.println("Size:"+vc.size());
	System.out.println("Size:"+vc.capacity());
	//checking cat is present in vector or not
	System.out.println(vc);
	if (vc.contains("Cat")) {
		System.out.println("Element present");
	}else {
		System.out.println("Element not present");
	}// getting first element
	System.out.println("1st element:"+vc.firstElement());
	//getting last element
	System.out.println("last element:"+vc.lastElement());
	//checking index of specific element
	System.out.println("index:"+vc.indexOf("Cat"));
	}
	
	
}

