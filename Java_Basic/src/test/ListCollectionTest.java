package test;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionTest {

	public static void main(String[] args) {
		// List(Interface)
		//  순서가 유지(중요)
		List<String> list = new ArrayList<>();
		String name = new String("홍기정");
		
		list.add("김도완");
		list.add(new String("황현준"));
		list.add(name);
		list.add(2, "김병석");
		
		//System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		
		list.remove(1);
		
		System.out.println(list.get(1));
	}

}
