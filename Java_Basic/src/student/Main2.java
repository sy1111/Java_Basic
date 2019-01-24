package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main2 {

	public static void main(String[] args) {
		Student stu01 = new Student("홍길동");
		stu01.setkScore(99);
		stu01.seteScore(90);
		stu01.setmScore(89);
		stu01.setName("홍길순");

		/*
		 * System.out.println(stu01.getName() + ": " + stu01.getkScore() + ", " +
		 * stu01.geteScore() + ", " + stu01.getmScore());
		 */
		
		Student stu02 = new Student("김도완");
		
		Map<Integer, Student> studentMap = new HashMap<> ();
		studentMap.put(1001, stu01);
		studentMap.put(1002, stu02);
		studentMap.put(1003, new Student("장재영"));
		studentMap.put(1004, new Student("이하진"));
		
		studentMap.replace(1001, new Student("조지선"));
		
		Iterator<Entry<Integer, Student>> iter = 
				studentMap.entrySet().iterator();
		
		Student searchStudent = new Student("이하진");
		while (iter.hasNext()) {
			Entry<Integer, Student> e = iter.next();
		
			if (e.getValue().equals(searchStudent)) {
				System.out.println("Found: ..." );
			}
			
		}

		System.out.println("done...");
	}

}
