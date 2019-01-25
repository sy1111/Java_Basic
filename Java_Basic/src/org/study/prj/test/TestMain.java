package org.study.prj.test;

import org.study.prj.model.Student;

public class TestMain {

	public static void main(String[] args) {
		Student s01 = new Student();
		Student s02 = new Student("정종현");
		s01.setAddress("부산시");
		s02.setAddress("서울시 강남구");
		
		System.out.println(s01);
		System.out.println(s02);
		
		if (Student.checkUid()) {
			System.out.println("Alert!!! New Implementation required...");
		}
		
	}

}
