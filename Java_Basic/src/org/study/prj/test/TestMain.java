package org.study.prj.test;

import org.study.prj.model.School;
import org.study.prj.model.SchoolPerson;
import org.study.prj.model.Student;
import org.study.prj.model.Teacher;

public class TestMain {

	public static void main(String[] args) {
		Student s01 = new Student();
		Student s02 = new Student("정종현");
		s01.setAddress("부산시");
		s02.setAddress("서울시 강남구");
		
		System.out.println(s01);
		System.out.println(s02);
		
		Teacher t01 = new Teacher();
		Teacher t02 = new Teacher("임지택");
		
		SchoolPerson person01 = new Teacher();
		SchoolPerson person02 = new Student();
		
		if (person01.getType().equals("Student")) {
			System.out.println("학생입니다.");
		} else if (person01.getType().equals("Teacher")) {
			System.out.println("선생님입니다.");
		} else {
			
		}
		
		School school = new School();
		school.register((Teacher)person01);
		school.register(s01);
		
		//SchoolPerson person03 = new SchoolPerson();
		
		System.out.println(t01);
		System.out.println(t02);
		
		if (Student.checkUid()) {
			System.out.println("Alert!!! New Implementation required...");
		}
		
	}

}
