package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCollectionTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		System.out.println(map);
		System.out.println(map.get("one"));
		
		map.replace("one", 10);
		System.out.println(map);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println("key: " + entry.getKey() 
					+ ", " + "value: " + entry.getValue());
		}
	}

}







