package basic;

import java.util.Scanner;

public class Basic_02 {

	public static void main(String[] args) {
		/*
		 * 문자열이 숫자인가?
		 * 숫자이면 각 숫자의 합을 구하시오,
		 *  
		 */
		String message;
		// 참조형 데이터 타입
		/*
		 * if (args == null || args.length == 0) { message = ""; } else { message =
		 * args[0]; }
		 */
		Scanner scan = new Scanner(System.in);
		message = scan.next();
		
		int sum = 0;
		// 문자열의 각 캐릭터가 숫자인지 판단
		// 숫자이면 각 숫자를 누적
		// '1' --> integer(49) --> 1
		int index = 0;
		while (index < message.length()) {
			if (message.charAt(index) >= '0' && message.charAt(index) <= '9') {
				sum = sum + (message.charAt(index) - 48);
			}
			
			index = index + 1;
		}

		System.out.println(sum);
	}

}










