package loop;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
	
		// 반복문
		// 1에서 100까지 정수를 합하는 프로그램
		// while , for
		int i = 1;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		String message = scanner.next();
//		System.out.println("--> " + message);
		
		// 스트링이 숫자인지?
		int length = message.length();
		
		// "123" , "12a" , "rose"
		i = 0;
		boolean isDigit = true;
		while (i < length) {
			// 특정 i 인덱스의 캐릭터가 숫자 캐릭터의 범위인지?
			if (!(message.charAt(i) >= '0' && message.charAt(i) <= '9')) {
				isDigit = false;
				break;
			}
			
			i = i + 1;
		}
		
		if (isDigit == true) {
			int num = Integer.parseInt(message);
			i = 1;
			while (i <= num) {
				sum = sum + i;
				i = i + 1;
			}
			
			System.out.println(sum);
		} else {
			System.out.println("잘못된 입력을 하였습니다.");
		}

	}

}
