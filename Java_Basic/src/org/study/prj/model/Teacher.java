package org.study.prj.model;

public class Teacher extends SchoolPerson
	implements Registrable {

	private static long tUid = 1L;
	
	// 속성, member variables
	private long t_id;
	
	// 메소드
	// 생성자
	public Teacher() {
		super();
		//super(null);
		t_id = generateTId();
		
	}
	
	public Teacher(String name) {
		//super();
		t_id = generateTId();
		//this.name = name;
	}
	
	private long generateTId() {
		return tUid++;
	}

	public long getT_id() {
		return t_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (t_id ^ (t_id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Teacher other = (Teacher) obj;
		if (t_id != other.t_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", t_name=" + name + ", address=" + address + "]";
	}

	@Override
	public String getType() {
		return "Teacher";
	}

	@Override
	public boolean register() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
