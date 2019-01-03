package loop;

import java.util.Arrays;
import java.util.Scanner;

public class PersonalInfo {

	public static void main(String[] args) {
		/*
		 * 사용자로 부터 관리할 사람들의 수를 입력
		 * 입력 받은 수만큼 사람들의 이름을 입력(5명 이상)
		 * 
		 * 출력:
		 *  - 홀수 번째의 사람들 이름을 출력
		 *  
		 *  사용자로 부터
		 *  Scanner scanner = new Scanner(System.in);
		 *  scanner.next() --> 문자열
		 *  scanner.nextInt() --> 정수
		 *  
		 */

		int num = 0;	// 사용자로 부터 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("관리할 사람의 수: ");
		num = scan.nextInt();
		
		String[] names = new String[num];
		//String[] songs = {"abc", "twinkle", "heart"};
		
		int i = 0;
		while (i < num) {
			System.out.print(i + " - 이름: ");
			names[i] = scan.next();
			i = i + 1;
		}
		
		// 홀수번째 인덱스(순서)
		i = 0;
		while (i < num) {
			if (i % 2 == 0) {
				System.out.println("[" + i + "] - " + names[i]);
			} 
			
			i++;
		}
		
		//System.out.println(Arrays.toString(names));
		
		
		
		
		//System.out.println("사람수: " + num); // 5 --> "5"
	}

}
