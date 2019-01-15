package basic;

public class Basic_03 {

	public static void main(String[] args) {
		loopTest();
	}
	
	public static void loopTest() {	
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
