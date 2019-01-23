package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetCollectionTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("jkl");
		list.add("xyz");
		list.add("abc");
		System.out.println(list);
		
		Set<String> demoSet = new HashSet<> (list);
		
		System.out.println(demoSet);
		
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(50);
		set.add(5);
		set.add(10);
		set.add(99);
		set.add(-5);
		
		set.remove(5);
		
		Iterator<Integer> iter = set.iterator();
		int index = 1;
		while (iter.hasNext()) {
			if (iter.next() == 99) {
				iter.remove();
			}
		}
		
		System.out.println(set);
		
	}

}
