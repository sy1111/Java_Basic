package org.study.prj.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.study.prj.model.Student;

public class TestMainForInterface {

	public static void main(String[] args) {
		Student s01 = new Student("정명준");
		Student s02 = new Student("정종현");
		Student s03 = new Student("손유진");
		Student s04 = new Student("노수빈");
		Student s05 = new Student("김지연");
		
		Set<Student> students = new HashSet<> ();
		students.add(s01);
		students.add(s02);
		students.add(s03);
		students.add(s04);
		students.add(s05);
		
		System.out.println("SET -----");
		System.out.println(students);
		System.out.println("\n\n");
		// 정렬
		List<Student> studentList = 
				new ArrayList<> (students);
		//Collections.sort(studentList);
		StudentComparatorByName sComp = new StudentComparatorByName();
		StudentComparatorBySid sComp2 = new StudentComparatorBySid();
		studentList.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int firstId = Integer.parseInt(o1.getsId().substring(5));
				int secondId = Integer.parseInt(o2.getsId().substring(5));
				return (firstId - secondId);
			}
			
		});
		
		System.out.println("Sorted List -----");
		System.out.println(studentList);
	
	}

}

class StudentComparatorByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class StudentComparatorBySid implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int firstId = Integer.parseInt(o1.getsId().substring(5));
		int secondId = Integer.parseInt(o2.getsId().substring(5));
		return (firstId - secondId);
	}
	
}











