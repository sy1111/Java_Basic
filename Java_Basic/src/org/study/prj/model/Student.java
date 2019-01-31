package org.study.prj.model;

import java.util.HashSet;
import java.util.Set;

public class Student extends SchoolPerson 
	implements Registrable, Comparable {
	// 학생아이디:
	// unique한 아이디 발급
	private static int uId = 1;

	String sId;
	Set<String> regClasses;

	// 생성자
	public Student() {
		sId = generateSId();
		regClasses = new HashSet<>();
	}

	public Student(String name) {
		sId = generateSId();
		this.name = name;
		regClasses = new HashSet<>();
	}

	// 유니크한 학생아이디 발급
	// "SUID_XXXXX";
	private String generateSId() {
		String sid = "SUID_" + String.format("%05d", uId);
		uId++;
		return sid;
	}

	public Set<String> getRegClasses() {
		return regClasses;
	}

	public void setRegClasses(Set<String> regClasses) {
		this.regClasses = regClasses;
	}

	public String getsId() {
		return sId;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + name + ", address=" + address + "]";
	}

	// sId의 동일여부에 따른 구현
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sId == null) ? 0 : sId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sId == null) {
			if (other.sId != null)
				return false;
		} else if (!sId.equals(other.sId))
			return false;
		return true;
	}

	// 메소드
	public static boolean checkUid() {
		if (uId >= 90000) {
			return true;
		}

		return false;
	}

	public boolean registerClass(String cId) {
		return regClasses.add(cId);
	}

	@Override
	public String getType() {
		return "Student";
	}

	@Override
	public boolean register() {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public int compareTo(Object o) {
		/*
		 * if (!(o instanceof Student)) { return 1; }
		 * 
		 * // sId에 근거하에 대소 Student tempStudent = (Student)o;
		 * 
		 * if (sId.compareTo(tempStudent.getsId()) > 0) { return 1; } else if
		 * (sId.compareTo(tempStudent.getsId()) == 0) { return 0; } else { return -1; }
		 * 
		 * 
		 * return sId.compareTo(tempStudent.getsId());
		 */

		if (!(o instanceof Student)) {
			return 1;
		}
		
		/*
		 * Student tempStudent = (Student)o; int mySid =
		 * Integer.parseInt(sId.substring(5)); int yourSid =
		 * Integer.parseInt(tempStudent.getsId().substring(5));
		 * 
		 * return (mySid - yourSid);
		 */
		
		Student tempStudent = (Student)o;
		return name.compareTo(tempStudent.getName()) * -1;
	}

}
