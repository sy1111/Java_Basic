package student;

public class Main {

	public static void main(String[] args) {
		Student stu01 = new Student("홍길동");
		stu01.name = "홍길동";
		stu01.kScore = 60;
		stu01.eScore = 55;
		stu01.mScore= 99;
		
		Student stu02 = new Student("김도완");
		stu02.name = "김도완";
		stu02.kScore = 70;
		stu02.eScore = 85;
		stu02.mScore= 69;
		
		System.out.println(stu02.getSum());
	}

}
