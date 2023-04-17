package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		
		//creating map
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"Mango");
		map.put(108,"orange");
		map.put(105,"Banana");
		map.put(103,null);
		map.put(null,null);
		map.put(102,null);
		map.put(null,"Apple");
		map.put(109,"Litchi");
		//traversing
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			System.out.println("------------------------------------------");}
			map.putIfAbsent(102, "CustardApple");
			map.putIfAbsent(101, "WaterMelon");
			for(Map.Entry m:map.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
			}
			map.remove(103);
			System.out.println(map);
		}}
			

