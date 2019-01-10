package excercise;

public class StringDemoEx02 {

	public static void main(String[] args) {
		/*
		 * String digit = "20123";
		 * 
		 * if (isDigit(digit)) { System.out.println(digit + ": True"); } else {
		 * System.out.println(digit + ": False"); }
		 */
		
		displayTime("1610"); 	// 05:45 am

	}

	/*
	 * 주어진 문자열이 숫자인지 판단
	 * "123" --> true
	 * "a123" / "12a5" --> false
	 * 입력: String
	 * 리턴: boolean
	 * 
	 * 입력 받은 문자열의 모든 캐릭터를 돌면서,
	 *  각 캐릭터가 숫자인지 판단
	 *    판단이 거짓이면, false를 리턴
	 * 
	 * 리턴 true
	 * 
	 */
	public static boolean isDigit(String str) {
		/*
		 * if (!(str.charAt(0) >= '1' && str.charAt(0) <= '9')) { return false; }
		 */
		
		for (int i = 1; i < str.length(); i++) {
			if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 시간 형태의 문자열을 입력 받아 출력(프린트)하는 메소드
	 * 
	 * "1555" --> 03:55 pm
	 * "0110" --> 01:10 am
	 * "abcd" --> Invalid format(잘못된 ..)
	 * 
	 * 입력: String(int)
	 * 리턴: void
	 */
	public static void displayTime(String time) {
		// 입력 받은 문자열의 길이가 넷인지 검사
		
		// 문자열을 substring으로 나눈다
		// hour = substring(0,2) / min = substring(2)
		
		// 나눈 스트링이 숫자인지 검사
		// 숫자이면 integer로 변환   Integer.parseInt()
		// 변환된 hour가 12보다 크면, 12를 빼고 pm으로 표시
		// 변환된 min이 59보다 작으면 출력
		
		if (time.length() != 4) {
			System.out.println("Invalid format!!!(length error)");
			return;
		} 
		
		String hourStr = time.substring(0, 2);
		String minStr = time.substring(2);
		
		if (!(isDigit(hourStr) && isDigit(minStr))) {
			System.out.println("Invalid format!!!(not digits)");
			return;
		}
		
		int hour = Integer.parseInt(hourStr);
		int min = Integer.parseInt(minStr);
		String timeStr = "";
		
		if (min > 59) {
			System.out.println("Invalid format!!!(not proper for min)");
			return;
		}
		
		if (hour > 11 && hour < 24) {
			// pm
			if (hour == 12) {
				timeStr = String.format("%02d", hour) 
						+ ":" + min + " pm";
			} else {
				timeStr = String.format("%02d", hour-12) + ":" + min + " pm";
			}
		} else if (hour < 12) {
			// am
			timeStr = String.format("%02d", hour) + ":" + min + " am";
		} else {
			System.out.println("Invalid format!!!(not proper for hour)");
			return;
		}
		
		System.out.println(timeStr);
		
	}
	
}
























