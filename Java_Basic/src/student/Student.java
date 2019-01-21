package student;

// 접근제어자 (access modifier)
// public / protected / default / private
class Student {

	String name;
	int kScore;
	int eScore;
	int mScore;
	
	// 메소드
	// 생성자(constructor)
	// default 생성자
	Student() { }
	
	Student(String name) {
		this.name = name;
		kScore = -1;
		eScore = -1;
		mScore = -1;
	}
	
	// 점수의 총합을 리턴
	// 입력: 
	// 리턴: int
	int getSum() {
		int sum = kScore + eScore + mScore;
		return sum;
	}
}
