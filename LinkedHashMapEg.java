package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> map1=new LinkedHashMap<Integer,String> ();
	map1.put(101,"Mango");
	map1.put(108,"orange");
	map1.put(105,"Banana");
	map1.put(103,"grapes");
	map1.put(null,null);
	map1.put(102,null);
	map1.put(null,"Apple");
	map1.put(107,"Mango");
	//traversing
	for(Map.Entry m:map1.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());}
		System.out.println("------------------------------------------");
		map1.putIfAbsent(102, "CustardApple");
		map1.putIfAbsent(101, "WaterMelon");
		for(Map.Entry m:map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());}
			//key
			System.out.println("Keys:"+map1.keySet());
			//value
			System.out.println("Values:"+map1.values());
			//key-value
			System.out.println("Keys & values:"+map1.entrySet());
			map1.remove(103);
			System.out.println("After removal");
			for(Map.Entry m:map1.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
}
}}
