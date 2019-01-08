package excercise;

public class CodingEx03 {

	public static void main(String[] args) {
		/*
		 * String sample = "0182345679";
		 * 
		 * boolean isValid = checkNumbers(sample);
		 * 
		 * if (isValid) { System.out.println("Correct!"); } else {
		 * System.out.println("Wrong!"); }
		 */
		
		countNumberOccurrence(1000);
	}

	/**
	 * 입력: String
	 * 리턴: boolean
	 * 
	 * .... 0 ~ 9
	 * 
	 */
	public static boolean checkNumbers(String str) {
		boolean[] checks = new boolean[10];
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch >= '0' && ch <= '9') {
				int index = ch - 48;
				if (checks[index]) {
					return false;
				}
				checks[index] = true;
			}
		}
		
		for (int i = 0; i < checks.length; i++) {
			if (checks[i] == false) {
				return false;
			}
		}
		
		return true;
	}
	
	
	/**
	 * 1 ~ n 사이의 숫자 갯수 구하기
	 * 
	 * 입력: 정수
	 * 리턴: void
	 * 
	 * 콘솔에 결과를 프린트
	 * 
	 * int[] countNum = new int[10];
	 * 1부터 limit까지 반복
	 *   1 --> "1", 111 --> "111" String.valueOf(10); "10"
	 * 
	 * 
	 */
	public static void countNumberOccurrence(int limit) {
		
	}
}














