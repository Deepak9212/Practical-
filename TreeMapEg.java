package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {
public static void main(String[] args) {
	TreeMap<Integer,String> map2=new TreeMap<Integer,String>();
	map2.put(101, " Mango");
	map2.put(108, "orange");
	map2.put(105, " Banana");
	map2.put(103, " Grapes");
	map2.put(105, " Banana");
	//map2.put(null, " Chiku");
	map2.put(107, null);
	System.out.println(map2);
	map2.putIfAbsent(102, "CustardApple");
	map2.putIfAbsent(101, "WaterMelon");
	System.out.println("------------------------------------------");
	for(Map.Entry m:map2.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	map2.remove(103);
	System.out.println("------------------------------------------");
	System.out.println("After removal");
	for(Map.Entry m:map2.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
}
}
