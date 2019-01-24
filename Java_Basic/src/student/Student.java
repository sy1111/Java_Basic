package student;

// 접근제어자 (access modifier)
// public / protected / default / private
class Student {
	// 멤버 변수(variables)
	private String name;
	private int kScore;
	private int eScore;
	private int mScore;
	
	// 메소드
	// 생성자(constructor)
	// default 생성자
	//Student() { }
	
	Student(String name) {
		this.name = name;
		this.kScore = -1;
		this.eScore = -1;
		this.mScore = -1;
	}
	
	// 점수의 총합을 리턴
	// 입력: 
	// 리턴: int
	int getSum() {
		int sum = this.kScore + this.eScore + this.mScore;
		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getkScore() {
		return kScore;
	}

	public void setkScore(int kScore) {
		this.kScore = kScore;
	}

	public int geteScore() {
		return eScore;
	}

	public void seteScore(int eScore) {
		this.eScore = eScore;
	}

	public int getmScore() {
		return mScore;
	}

	public void setmScore(int mScore) {
		this.mScore = mScore;
	}

	// annotation
	@Override
	public String toString() {
		return "Student [name=" + name + ", kScore=" 
				+ kScore + ", eScore=" + eScore 
				+ ", mScore=" + mScore + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
