package loop;

public class ForDemo {

	public static void main(String[] args) {
		// while (조건문) {
		//    ...
		// }
		
		// 구구단 9단을 출력
		// 9 * 1 = 9
		// 9 * 2 = 18
		// ...
		// 9 * 9 = 81
		/*
		 * int i = 1; while (i <= 9) { // 9 * i = 9 * i int result = 9 * i;
		 * System.out.println("9 * " + i + " = " + result); i++; }
		 */
		
		// for (초기화; 조건문; 증감) {
		// ...
		// }
		for (int j = 1; j <= 9; j++) {
			int result = 9 * j;
			System.out.println("9 * " + j + " = " + result);
		}
		
	}

}
