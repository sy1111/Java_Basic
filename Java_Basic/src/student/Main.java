package student;

import java.util.ArrayList;
import java.util.List;

public class Main {

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
		
		List<Student> students = new ArrayList<> ();
		students.add(stu01);
		students.add(stu02);
		students.add(new Student("김지연"));
		students.add(1, new Student("노수빈"));
		
		//System.out.println(students);
		
		students.remove(1);
		
		//System.out.println(students);
		for (int i = 0; i < students.size(); i++) {
			Student tempStudent = students.get(i);
			System.out.println(tempStudent.getName() + ": " + 
					tempStudent.getkScore());
		}

	}

}
