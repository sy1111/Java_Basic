package _02_control;

public class StringDemo {

	// 문자열의 마지막에 . , 으로 끝나는지 판단하고
	// 결과를 적절히 출력하세요.
	public static void main(String[] args) {
		// 기본 데이터 타입
		// 참조형 데이터 타입
		String a = "abcd";
		String message = "I am studying a programming,";
		
		int length = message.length();
		char ch = message.charAt(length - 1);
		if (ch == '.' || ch == ',') {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong");
		}
	}

}
