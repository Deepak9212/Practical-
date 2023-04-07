package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
public static void main(String[] args) {
	//ArayList all=new ArrayList();//non generic
	//creating a Arraylist genric
	ArrayList<String> al=new ArrayList<String>();
	al.add("Rose");
	al.add("Sunflower");
	al.add("Lily");
	al.add("Daisy");
	al.add("MariGold");
	al.add("Jasmine");
	al.add("Orchid");
	
	//converting list to array
	System.out.println("List to array");
	// toArray()method used to convert list to array
	String [] arr=al.toArray (new String [al.size()]);
	for(String s:arr) { //traversing using for each
		System.out.println(s);
		
	}
	//converting Array to list
		System.out.println("Array to list");
		
		List<String> all=new ArrayList<String>();
		all=Arrays.asList(arr); //traversing using for each
			System.out.println(all);
			
		}
}

