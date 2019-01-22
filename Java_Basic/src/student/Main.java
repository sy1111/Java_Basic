package student;

public class Main {

	public static void main(String[] args) {
		Student stu01 = new Student("홍길동");
		stu01.setkScore(99);
		stu01.seteScore(90);
		stu01.setmScore(89);
		stu01.setName("홍길순");
		
		System.out.println(stu01.getName() + ": " +
				stu01.getkScore() + ", " +
				stu01.geteScore() + ", " +
				stu01.getmScore());
		
		Student stu02 = new Student("김도완");
		
		 
		
		
	}

}
